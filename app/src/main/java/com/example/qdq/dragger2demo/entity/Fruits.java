package com.example.qdq.dragger2demo.entity;

/**
 * Created by qdq on 2017/9/7.
 */

public class Fruits {

    private OrangeBean orangeBean;//橘子
    private BananaBean bananaBean;

    public Fruits(OrangeBean orangeBean, BananaBean bananaBean) {
        this.orangeBean = orangeBean;
        this.bananaBean = bananaBean;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "orangeBean=" + orangeBean +
                ", bananaBean=" + bananaBean +
                '}';
    }
}
