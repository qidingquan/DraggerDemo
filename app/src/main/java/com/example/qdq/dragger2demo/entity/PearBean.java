package com.example.qdq.dragger2demo.entity;

import com.example.qdq.dragger2demo.annotation.TodoScope;

import javax.inject.Inject;

/**
 * Created by qdq on 2017/9/7.
 */
@TodoScope
public class PearBean {
    private String name;
    @Inject
    public PearBean() {
        this.name="梨子";
    }

}
