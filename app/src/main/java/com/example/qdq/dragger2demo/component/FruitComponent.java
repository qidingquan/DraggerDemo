package com.example.qdq.dragger2demo.component;

import com.example.qdq.dragger2demo.annotation.TodoScope;
import com.example.qdq.dragger2demo.module.FruitModule;
import com.example.qdq.dragger2demo.ui.FruitActivity;

import dagger.Component;

/**
 * Created by qdq on 2017/9/7.
 */
@TodoScope
@Component(modules = {FruitModule.class})
public interface FruitComponent {

    void injectFruitActivity(FruitActivity fruitActivity);
}
