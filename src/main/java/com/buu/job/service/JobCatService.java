package com.buu.job.service;

import com.buu.job.domain.JobCat;

import java.util.List;

/**
 * Created by Administrator on 2016/11/17.
 */
public interface JobCatService {
    List<JobCat> getJobCatByParentId(int parentId);
    public Integer getPostIdByName(String catName);
}
