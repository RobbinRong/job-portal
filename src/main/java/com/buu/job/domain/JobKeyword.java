package com.buu.job.domain;

public class JobKeyword {
    private Integer id;

    private String keyword;

    private Integer count;

    private Integer positioncatid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getPositioncatid() {
        return positioncatid;
    }

    public void setPositioncatid(Integer positioncatid) {
        this.positioncatid = positioncatid;
    }
}