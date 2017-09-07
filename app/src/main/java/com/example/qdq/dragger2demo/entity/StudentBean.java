package com.example.qdq.dragger2demo.entity;

import javax.inject.Inject;

/**
 * Created by qdq on 2017/9/7.
 */

public class StudentBean {

    private int no;
    private String name;

    @Inject
    AreaBean areaBean;
    @Inject
    ScoreBean scoreBean;

    @Inject
    public StudentBean() {
        this.no = 1;
        this.name = "赵四";
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", areaBean=" + areaBean +
                ", scoreBean=" + scoreBean +
                '}';
    }
}
