package com.wxmylife.morgan.home;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.wxmylife.morgan.base.moduleinterface.module.home.HomeIntent;
import com.wxmylife.morgan.base.moduleinterface.provider.IHomeProvider;

/**
 * Created by wxmylife on 2017/4/20.
 */
@Route(path = IHomeProvider.HOME_ACT_SPLASH)
public class SplashActivity extends AppCompatActivity {

    private Handler mHandler;


    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mHandler = new Handler(getMainLooper());
    }

    @Override
    protected void onResume() {
        super.onResume();
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                HomeIntent.launchHome(2);
                finish();
            }
        }, 1500);
    }
}
