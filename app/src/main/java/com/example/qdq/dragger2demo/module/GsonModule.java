package com.example.qdq.dragger2demo.module;

import com.google.gson.Gson;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/9/1.
 */
@Module
public class GsonModule {

    @Provides   //module类对外提供实例方法的注解
    public Gson provideGson() {
        return new Gson();
    }

}
