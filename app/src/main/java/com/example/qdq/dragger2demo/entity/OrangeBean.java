package com.example.qdq.dragger2demo.entity;

import android.util.Log;

import com.example.qdq.dragger2demo.annotation.TodoScope;

import javax.inject.Inject;

/**
 * Created by qdq on 2017/9/7.
 */
@TodoScope
public class OrangeBean {

    private static final String TAG = "OrangeBean";
    private String name;
    private double price;
    private String area;

    @Inject
    public OrangeBean(double price) {
        this.name="橘子";
        this.price=price;
        Log.e(TAG, "OrangeBean()");
    }

    @Override
    public String toString() {
        return "OrangeBean{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", area='" + area + '\'' +
                '}';
    }
}
