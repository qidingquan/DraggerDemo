package com.example.qdq.dragger2demo.entity;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by qdq on 2017/9/7.
 */

public class BananaBean {
    private static final String TAG = "BananaBean";
    private String name;
    private double price;
    private String area;
    @Inject
    public BananaBean() {
        this.name = "香蕉";
        Log.e(TAG, "BananaBean()");
    }
    public BananaBean(String name) {
        this.name = name;
    }
    public BananaBean(String name, double price, String area) {
        this.name = name;
        this.price = price;
        this.area = area;
    }

    @Override
    public String toString() {
        return "BananaBean{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", area='" + area + '\'' +
                '}';
    }
}
