package com.buu.job.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/30.
 */
public class ChartLineData {
    public List<DataSet> dataset;
public ChartLineData() {
        this.dataset = new ArrayList<DataSet>();
    }

    @Override
    public String toString() {
        return "ChartLineData{" +
                "dataSets=" + dataset +
                '}';
    }
}
