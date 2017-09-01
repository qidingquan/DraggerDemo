package com.example.qdq.dragger2demo.module;

import com.example.qdq.dragger2demo.entity.User;
import com.example.qdq.dragger2demo.UserScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/9/1.
 */
@Module
public class UserModule {
    @Provides
    @UserScope //作用范围
    public User provideUser(){
        return new User();
    }
}
