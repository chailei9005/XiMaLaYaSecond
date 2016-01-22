package chailei.com.ximalayasecond.fragments;


import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import chailei.com.ximalayasecond.BR;
import chailei.com.ximalayasecond.R;
import chailei.com.ximalayasecond.adapters.FocusImageAdapter;
import chailei.com.ximalayasecond.adapters.RecyclerViewAdapter;
import chailei.com.ximalayasecond.databinding.FocusImagesItemBinding;
import chailei.com.ximalayasecond.databinding.FragmentHomeBinding;
import chailei.com.ximalayasecond.entitys.DiscoveryColumnEntity;
import chailei.com.ximalayasecond.entitys.FocusImageEntity;
import chailei.com.ximalayasecond.entitys.FocusImages;
import chailei.com.ximalayasecond.entitys.HomeEntity;
import chailei.com.ximalayasecond.entitys.RecommendEntity;
import chailei.com.ximalayasecond.utils.NetWorkUtil;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements Callback<HomeEntity> {


    private RecyclerViewAdapter adapter;
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Map<Type,RecyclerViewAdapter.BindingTool> map = new HashMap<>();
        map.put(RecommendEntity.class,new RecyclerViewAdapter.BindingTool(R.layout.recommend_item,BR.recommend));
        map.put(DiscoveryColumnEntity.class, new RecyclerViewAdapter.BindingTool(R.layout.discovery_column_item, BR.column));
        map.put(FocusImages.class,new RecyclerViewAdapter.BindingTool(R.layout.focus_images_item,BR.focusImages));
        adapter = new RecyclerViewAdapter(getContext(),map,new ArrayList<>());
        NetWorkUtil.getHomeService().getHome().enqueue(this);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentHomeBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        binding.homeRecycler.setAdapter(adapter);
        return binding.getRoot();
//        return null;
    }


    @Override
    public void onResponse(Response<HomeEntity> response, Retrofit retrofit) {

        HomeEntity body = response.body();
        adapter.add(body.getFocusImages());
        adapter.add(body.getDiscoveryColumns());
        adapter.add(body.getEditorRecommendAlbums());
    }

    @Override
    public void onFailure(Throwable t) {

    }
    @android.databinding.BindingAdapter("bind:init")
    public static void initFocusPager(View view,List<FocusImageEntity> list){
        final FocusImagesItemBinding binding = DataBindingUtil.getBinding(view);

        if(binding.focusPager.getAdapter() == null){
            binding.focusPager.setAdapter(new FocusImageAdapter(list));

            binding.focusPager.post(new Runnable() {
                @Override
                public void run() {
                    ViewGroup.LayoutParams params = binding.focusPager.getLayoutParams();
                    params.height = (int) (binding.focusPager.getWidth() / 2.13f);
                    binding.focusPager.setLayoutParams(params);
                }
            });
            binding.focusGroup.removeAllViews();
            LayoutInflater inflate = LayoutInflater.from(view.getContext());
            for (int i = 0; i < list.size(); i++) {
                View in = inflate.inflate(R.layout.indicator,binding.focusGroup,false);
                in.setId(i);
                binding.focusGroup.addView(in);
            }
            binding.focusPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }

                @Override
                public void onPageSelected(int position) {
                    binding.focusGroup.check(position);
                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });
            Handler handler = new Handler(){
                @Override
                public void handleMessage(Message msg) {
                    int i = binding.focusPager.getCurrentItem()+1;
                    if (i >= binding.focusGroup.getChildCount()){
                        i = 0;
                    }
                    binding.focusPager.setCurrentItem(i);
                    sendEmptyMessageDelayed(0, 5000);
                }
            };
            handler.sendEmptyMessageDelayed(0, 5000);
        }
    }
}
