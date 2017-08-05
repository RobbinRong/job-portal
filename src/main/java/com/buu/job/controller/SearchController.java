package com.buu.job.controller;

import com.buu.job.domain.JobData;
import com.buu.job.domain.Page;
import com.buu.job.domain.Param;
import com.buu.job.service.IndexService;
import com.buu.job.service.JobListService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Collections;
import java.util.List;

/**
 * Created by xianshengrong on 2016/12/9.
 */
@Controller
public class SearchController {

    @Autowired
    IndexService indexService;

    @Autowired
    JobListService jobListService;
    private Logger logger = LoggerFactory.getLogger(SearchController.class);


    @RequestMapping("/search/create")
    @ResponseBody
    public JobData indexCreate(){
        logger.info("/search/create start");
        long startime=System.currentTimeMillis();
        JobData data;
        try{
            indexService.createIndex();
            data=JobData.success("create successful");
        }
        catch(Exception e){
            data=JobData.fail(e);
            e.printStackTrace();
        }
        logger.info("/search/create end 用时"+(System.currentTimeMillis()-startime));
        return  data;
    }
    @RequestMapping("/search/delete")
    @ResponseBody
    public JobData indexDetele(){
        logger.info("/search/delete  start");
        long startime=System.currentTimeMillis();
        JobData data;
        try{
            indexService.deleteIndex();
            data=JobData.success("delete successful");
        }
        catch(Exception e){
            data=JobData.fail(e);
            e.printStackTrace();
        }
        logger.info("/search/delete end用时"+(System.currentTimeMillis()-startime));
        return  data;
    }
    @RequestMapping("/search/{jobCat}")
    @ResponseBody
    public JobData search(@PathVariable String jobCat,String keyword,String city,String wy
            ,String edu,String rz,String field,int sort,String sal,String nature,int page,int rows,RedirectAttributes attr){
        long startime=System.currentTimeMillis();
        logger.info("/search/{jobCat} start params:jobCat="+jobCat+",keyword="+keyword+",city="+city+",wy="
                +wy+",edu="+edu+",rz="+rz+",field="+field+",sort="+sort+",sal="+sal+",nature="+nature+",page="+page+",srowsal="+rows);
        Param param;
        Page p;
        JobData data;
        try{
            param=new Param(jobCat,city,wy,edu,rz,field,1,sal,nature);
            if("keyword".equals(keyword)){
                p=jobListService.getJobsByPage(Collections.EMPTY_LIST,param,page,rows);
            }else {
                List<Integer> positionids = indexService.search(keyword);
                p=jobListService.getJobsByPage(positionids,param,page,rows);
            }
            p.setParam(param);
            data=JobData.success(p);
            logger.info("/search/{jobCat} end 用时"+(System.currentTimeMillis()-startime));
            return  data;
        }
        catch(Exception e){
            e.printStackTrace();
            return  JobData.fail();
        }

    }
}
