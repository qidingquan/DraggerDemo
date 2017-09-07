package com.example.qdq.dragger2demo.module;

import com.example.qdq.dragger2demo.annotation.TodoScope;
import com.example.qdq.dragger2demo.annotation.Type;
import com.example.qdq.dragger2demo.entity.BananaBean;
import com.example.qdq.dragger2demo.entity.Fruits;
import com.example.qdq.dragger2demo.entity.OrangeBean;
import com.example.qdq.dragger2demo.entity.PearBean;

import dagger.Module;
import dagger.Provides;

/**
 * Created by qdq on 2017/9/7.
 */
@TodoScope
@Module(includes = OrangeModule.class)
public class FruitModule {
    @Type("default")
    @Provides
    public BananaBean provideBananaBean() {
        return new BananaBean();
    }
    @Type("name")
    @Provides
    public BananaBean provideBananaNameBean(){
        return new BananaBean("黄色香蕉");
    }
    @Provides
    public PearBean providePearBean(){
        return new PearBean();
    }

    @Provides
    public Fruits provideFruits(OrangeBean orangeBean, BananaBean bananaBean) {
        return new Fruits(orangeBean, bananaBean);
    }
}
