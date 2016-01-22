package chailei.com.ximalayasecond.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.Date;

import chailei.com.ximalayasecond.entitys.HomeEntity;
import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.http.GET;

/**
 * Created by Administrator on 16-1-21.
 */
public class NetWorkUtil {
    public interface Service{
        @GET("/mobile/discovery/v1/recommends?channel=and-d11&device=android&includeActivity=false&includeSpecial=true&scale=2&version=4.3.44.2")
        Call<HomeEntity> getHome();
    }
    private static Service homeService;
    static {
        Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new TypeAdapter<Date>() {
            @Override
            public void write(JsonWriter out, Date value) throws IOException {
                out.value(value.getTime());
            }

            @Override
            public Date read(JsonReader in) throws IOException {
                long l = in.nextLong();
                return new Date(l);
            }
        }).create();
        homeService = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl("http://mobile.ximalaya.com").build().create(Service.class);

    }

    public static Service getHomeService(){
        return homeService;
    }
}
