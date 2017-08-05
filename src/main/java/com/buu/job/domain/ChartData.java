package com.buu.job.domain;

/**
 * Created by Administrator on 2016/11/18.
 */
public class ChartData implements Comparable<ChartData>{

    private String label;
    private int value;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ChartData(String label, int value) {
        this.label = label;
        this.value = value;
    }

    public ChartData() {
    }
    @Override
    public String toString() {
        return "ChartData{" +
                "label='" + label + '\'' +
                ", value=" + value +
                '}';
    }

    public int compareTo(ChartData o) {
        if(this.value>o.value){
            return -1;
        }else if(this.value<o.value){
            return 1;
        }else {
            return 0;
        }
    }
}
