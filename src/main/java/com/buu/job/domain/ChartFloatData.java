package com.buu.job.domain;

/**
 * Created by Administrator on 2016/11/18.
 */
public class ChartFloatData implements Comparable<ChartFloatData>{

    public String label;
    public float value;

    public ChartFloatData(String label, float value) {
        this.label = label;
        this.value = value;
    }

    public ChartFloatData() {
    }

    @Override
    public String toString() {
        return "ChartData{" +
                "label='" + label + '\'' +
                ", value=" + value +
                '}';
    }

    public int compareTo(ChartFloatData o) {
        if(o==this){
            return 0;
        }
        else if(this.value>o.value){
            return -1;
        }else if(this.value<o.value){
            return 1;
        }else if(o.value==this.value){
            return 0;
        }
        return 0;
    }
}
