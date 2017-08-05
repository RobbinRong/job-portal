package com.buu.job.domain;

/**
 * Created by xianshengrong on 2017/1/2.
 */
public class KeyWordData {
    public String keyword;
    public String count;

    public KeyWordData(String keyword, String count) {
        this.keyword = keyword;
        this.count = count;
    }
    public KeyWordData() {
    }
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o.getClass() == KeyWordData.class)
        {
            KeyWordData n = (KeyWordData)o;
            return n.keyword.equals(keyword);
        }
        return false;
    }
    public int hashCode()
    {
        return keyword.hashCode();
    }

    @Override
    public String toString() {
        return "KeyWordData{" +
                "keyword='" + keyword + '\'' +
                ", count='" + count + '\'' +
                '}';
    }
}
