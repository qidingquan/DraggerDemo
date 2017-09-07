package com.example.qdq.dragger2demo.entity;

import javax.inject.Inject;

/**
 * Created by qdq on 2017/9/7.
 */

public class AreaBean {
    private String provice;
    private String city;

    @Inject
    public AreaBean() {
        this.provice = "四川";
        this.city = "成都";
    }

    @Override
    public String toString() {
        return "AreaBean{" +
                "provice='" + provice + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
