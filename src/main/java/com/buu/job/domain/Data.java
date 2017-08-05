package com.buu.job.domain;

/**
 * Created by Administrator on 2016/11/30.
 */
public class Data {
    public  String value;

    public Data(String value) {
        this.value = value;
    }

    public Data() {
    }

    @Override
    public String toString() {
        return "Data{" +
                "value='" + value + '\'' +
                '}';
    }
}
