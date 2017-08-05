package com.buu.job.domain;

/**
 * Created by xianshengrong on 2016/12/30.
 */
public class Normal {
    private  String color;

    public Normal(String color) {
        this.color = color;
    }

    public Normal() {
        this.color = "black";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
