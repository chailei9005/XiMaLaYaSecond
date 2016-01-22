package chailei.com.ximalayasecond;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import chailei.com.ximalayasecond.fragments.HomeFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.main_contain,new HomeFragment()).commit();

    }
}
