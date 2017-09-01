package com.example.qdq.dragger2demo.component;

import com.example.qdq.dragger2demo.module.AppModule;
import com.example.qdq.dragger2demo.module.GsonModule;
import com.example.qdq.dragger2demo.module.ToastUtilModule;
import com.example.qdq.dragger2demo.ui.MainActivity;

import dagger.Component;

/**
 * Created by Administrator on 2017/9/1.
 */

@Component(modules = {AppModule.class, ToastUtilModule.class, GsonModule.class})
public interface AppComponent {

    void injectMainActivity(MainActivity mainActivity);

}
