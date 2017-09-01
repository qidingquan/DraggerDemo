package com.example.qdq.dragger2demo;

import android.app.Application;

/**
 * Created by Administrator on 2017/9/1.
 */

public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
//        DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }
}
