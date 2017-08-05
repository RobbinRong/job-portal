package com.buu.job.domain;

/**
 * Created by xianshengrong on 2016/12/30.
 */
public class ItemStyle {
    private Normal normal;

    public ItemStyle(Normal normal) {
        this.normal = normal;
    }

    public ItemStyle() {
        this.normal = new Normal();
    }

    public Normal getNormal() {
        return normal;
    }

    public void setNormal(Normal normal) {
        this.normal = normal;
    }
}
