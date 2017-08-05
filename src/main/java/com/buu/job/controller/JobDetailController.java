package com.buu.job.controller;

import com.buu.job.domain.ChartData;
import com.buu.job.domain.JobData;
import com.buu.job.domain.JobDetail;
import com.buu.job.domain.WordCloudData;
import com.buu.job.service.JobDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2016/11/17.
 */
@Controller
public class JobDetailController {

    @Autowired
    JobDetailService jobDetailService;

    private Logger logger= LoggerFactory.getLogger(JobDetailController.class);
    @RequestMapping("/jobdetail/{positionId}")
    public String getJobDetail(@PathVariable int positionId, ModelMap modelMap){
        logger.info("/jobdetail/{positionId} start positionId="+positionId);
        long startime=System.currentTimeMillis();
        JobData data;
        try{
            JobDetail jobDetail=jobDetailService.getJobDetailBypositionId(positionId);
            String s = jobDetail.getWelfare().replaceAll("职位诱惑 :", "");
            jobDetail.setWelfare(s);
            String s1 = jobDetail.getCompanynickname().replaceAll("拉勾认证企业", "");
            jobDetail.setCompanynickname(s1);
          data=JobData.success(jobDetail);
        }
        catch(Exception e){
            data=JobData.fail(e);
            e.printStackTrace();
        }
        modelMap.put("content",data);
        logger.info("/jobdetail/{positionId}  end 用时"+(System.currentTimeMillis()-startime));
        return  "detail";

    }


    @RequestMapping("/jobdetail/chartduty/{jobcat}")
    @ResponseBody
    public JobData getChartDuty(@PathVariable String jobcat){
        logger.info("/jobdetail/chartduty/{jobcat} start jobcat="+jobcat);
        long startime=System.currentTimeMillis();
        JobData data;
        try{
            List<ChartData> chartChartData=jobDetailService.getChartDuty(jobcat);
            data=JobData.success(chartChartData);
        }
        catch(Exception e){
            data=JobData.fail(e);
            e.printStackTrace();
        }

        logger.info("/jobdetail/chartduty/{jobcat} start jobcat=用时"+(System.currentTimeMillis()-startime));
        return  data;

    }

    @RequestMapping("/jobdetail/chartrequest/{jobcat}")
    @ResponseBody
    public JobData getChartPostRequest(@PathVariable String jobcat){
        logger.info("/jobdetail/chartrequest/{jobcat} start jobcat"+jobcat);
        long startime=System.currentTimeMillis();
        JobData data;
        try{
            List<WordCloudData> chartChartData=jobDetailService.getChartPostRequest(jobcat);
            data=JobData.success(chartChartData);
        }
        catch(Exception e){
            data=JobData.fail(e);
            e.printStackTrace();
        }

        logger.info("/jobdetail/chartrequest/{jobcat} end 用时"+(System.currentTimeMillis()-startime));
        return  data;

    }

}
