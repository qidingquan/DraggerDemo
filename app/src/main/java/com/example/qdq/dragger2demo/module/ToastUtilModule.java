package com.example.qdq.dragger2demo.module;

import com.example.qdq.dragger2demo.util.ToastUtil;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/9/1.
 */
@Module
public class ToastUtilModule {
    @Provides   //module类对外提供实例方法的注解
    public ToastUtil provideToast() {
        return new ToastUtil();
    }
}
