package com.example.qdq.dragger2demo.module;

import com.example.qdq.dragger2demo.entity.OrangeBean;

import dagger.Module;
import dagger.Provides;

/**
 * Created by qdq on 2017/9/7.
 */
@Module
public class OrangeModule {

    OrangeBean orangeBean;

    public OrangeModule(OrangeBean orangeBean) {
        this.orangeBean = orangeBean;
    }

    @Provides
    public OrangeBean provideOrangeBean() {
        return orangeBean;
    }
}
