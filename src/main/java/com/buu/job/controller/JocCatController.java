package com.buu.job.controller;

import com.buu.job.domain.JobCat;
import com.buu.job.domain.JobData;
import com.buu.job.service.JobCatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2016/11/17.
 */
@Controller
public class JocCatController {

    @Autowired
    JobCatService jobCatService;

    private org.slf4j.Logger logger = LoggerFactory.getLogger(JocCatController.class);

    @RequestMapping("/jobcat/{parentId}")
    @ResponseBody
    public JobData getJobCat(@PathVariable int parentId){
        logger.info("/jobcat/{parentId} start parentId="+parentId);
        long startime=System.currentTimeMillis();
        JobData data;
        try{
            List<JobCat> jobCats=jobCatService.getJobCatByParentId(parentId);
            data=JobData.success(jobCats);
        }
        catch(Exception e){
            data=JobData.fail(e);
            e.printStackTrace();
        }
        logger.info("/jobcat/{parentId} end用时:"+(System.currentTimeMillis()-startime));
        return  data;
    }
}
