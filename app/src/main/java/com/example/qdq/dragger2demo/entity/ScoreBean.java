package com.example.qdq.dragger2demo.entity;

import javax.inject.Inject;

/**
 * Created by qdq on 2017/9/7.
 */

public class ScoreBean {

    private double chinese;
    private double math;

    @Inject
    public ScoreBean() {
        this.chinese = 90.5;
        this.math = 78.0;
    }

    @Override
    public String toString() {
        return "ScoreBean{" +
                "chinese=" + chinese +
                ", math=" + math +
                '}';
    }
}
