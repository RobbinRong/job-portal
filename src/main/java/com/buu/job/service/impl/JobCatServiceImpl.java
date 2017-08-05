package com.buu.job.service.impl;

import com.buu.job.domain.JobCat;
import com.buu.job.domain.JobCatExample;
import com.buu.job.mapper.JobCatMapper;
import com.buu.job.service.JobCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/11/17.
 */
@Service
public class JobCatServiceImpl implements JobCatService {
    @Autowired
    JobCatMapper jobCatMapper;
    public List<JobCat> getJobCatByParentId(int parentId) {
        JobCatExample example=new JobCatExample();
        JobCatExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<JobCat> jobCats = jobCatMapper.selectByExample(example);
        return jobCats;
    }


    public Integer getPostIdByName(String catName){
        JobCatExample example=new JobCatExample();
        JobCatExample.Criteria jobCatExampleCriteria= example.createCriteria();
        jobCatExampleCriteria.andPositionNameEqualTo(catName);
        List<JobCat> jobCats = jobCatMapper.selectByExample(example);
        Integer id = jobCats.get(0).getId();
        return id;
    }
}
