package com.buu.job.domain;

/**
 * Created by Administrator on 2016/11/18.
 */
public class WordCloudData implements Comparable<WordCloudData>{

    private String name;
    private int value;
    private ItemStyle itemStyle;

    public ItemStyle getItemStyle() {
        return itemStyle;
    }

    public void setItemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public WordCloudData(String name, int value,ItemStyle itemStyle) {
        this.name = name;
        this.value = value;
        this.itemStyle=itemStyle;
    }

    public WordCloudData() {
    }
    @Override
    public String toString() {
        return "ChartData{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public int compareTo(WordCloudData o) {
        if(this.value>o.value){
            return -1;
        }else if(this.value<o.value){
            return 1;
        }else {
            return 0;
        }
    }
}
