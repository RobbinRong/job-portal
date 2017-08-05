package com.buu.job.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/30.
 */
public class DataSet {
    public  String seriesname;
    public List<Data> data;

    public DataSet(String seriesname) {
        this.seriesname = seriesname;
        data=new ArrayList<Data>();
    }
    public DataSet() {
        data=new ArrayList<Data>();
    }

    @Override
    public String toString() {
        return "DataSet{" +
                "seriesname='" + seriesname + '\'' +
                ", data=" + data +
                '}';
    }
}
