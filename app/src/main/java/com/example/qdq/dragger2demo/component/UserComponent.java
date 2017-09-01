package com.example.qdq.dragger2demo.component;

import com.example.qdq.dragger2demo.module.UserModule;
import com.example.qdq.dragger2demo.ui.MainActivity;

import dagger.Subcomponent;

/**
 * Created by Administrator on 2017/9/1.
 */

@Subcomponent(modules = UserModule.class)
public interface UserComponent {

    void injectMainActivity(MainActivity mainActivity);
}
