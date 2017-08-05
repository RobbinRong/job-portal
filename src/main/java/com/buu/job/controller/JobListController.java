package com.buu.job.controller;

import com.buu.job.domain.*;
import com.buu.job.service.JobListService;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/11/16.
 */
@Controller
public class JobListController {
    @Autowired
    public JobListService jobListService;
    private Logger logger = LoggerFactory.getLogger(JobListController.class);

    @RequestMapping("/jobs/list")
    @ResponseBody
    public JobData getJobList(@RequestParam("positionids") List<Integer> positionids,@RequestParam("param") String param,
                              @RequestParam("page") int page,@RequestParam("rows") int rows,@RequestParam("jobcat") String jobcat){
        logger.info("/jobs/list start positionids="+positionids.toString()+",param="+param+",page="+page+",rows="+rows+",jobcat="+jobcat);
        long startime=System.currentTimeMillis();
        Page p;
        JobData data;
        try{
            Gson gson=new Gson();
            Param par=gson.fromJson(param,Param.class);
            par.setJobCat(jobcat);
            p=jobListService.getJobsByPage(positionids,par,page,rows);
            p.setParam(par);
            data=JobData.success(p);
        }
        catch(Exception e){
            data=JobData.fail(e);
            e.printStackTrace();
        }

        logger.info("/jobs/list end 用时:"+(System.currentTimeMillis()-startime));
        return  data;
    }

    @RequestMapping("/jobs/chart/countcolumn")
    @ResponseBody
    public JobData getChartCountColumn(String postcatid){
        logger.info("/jobs/chart/countcolumn start positionid="+postcatid);
        long startime=System.currentTimeMillis();
        JobData data;
        try{
                List<ChartData> chartChartData =jobListService.getChartPostCount(postcatid);
                data=JobData.success(chartChartData);
        }
        catch(Exception e){
            data=JobData.fail(e);
            e.printStackTrace();
        }
        logger.info("/jobs/chart/countcolumn end 用时"+(System.currentTimeMillis()-startime));
        return  data;
    }

    @RequestMapping("/jobs/chart/fieldpie")
    @ResponseBody
    public JobData getChartFiledPie(String post){
        logger.info("/jobs/chart/fieldpie start post="+post);
        long startime=System.currentTimeMillis();
        JobData data;
        try{
            List<ChartData> chartChartData =jobListService.getChartFiled(post);
            data=JobData.success(chartChartData);
        }
        catch(Exception e){
            data=JobData.fail(e);
            e.printStackTrace();
        }
        logger.info("/jobs/chart/fieldpie end 用时"+(System.currentTimeMillis()-startime));
        return  data;
    }

    @RequestMapping("/jobs/chart/companysizepie")
    @ResponseBody
    public JobData getChartCompanySizePie(Integer postId){
        logger.info("/jobs/chart/companysizepie start pospostIdt="+postId);
        long startime=System.currentTimeMillis();
        JobData data;
        try{
            List<ChartData> chartChartData =jobListService.getChartCompanySize(postId);
            data=JobData.success(chartChartData);
        }
        catch(Exception e){
            data=JobData.fail(e);
            e.printStackTrace();
        }
        logger.info("/jobs/chart/companysizepie end 用时"+(System.currentTimeMillis()-startime));
        return  data;
    }
    @RequestMapping("/jobs/chart/financestage")
    @ResponseBody
    public JobData getChartFinanceStagePie(String post){
        logger.info("/jobs/chart/financestage start post="+post);
        long startime=System.currentTimeMillis();
        JobData data;
        try{
            List<ChartData> chartChartData =jobListService.getChartFinanceStagePie(post);
            data=JobData.success(chartChartData);
        }
        catch(Exception e){
            data=JobData.fail(e);
            e.printStackTrace();
        }
        logger.info("/jobs/chart/financestage end 用时"+(System.currentTimeMillis()-startime));
        return  data;
    }
    @RequestMapping("/jobs/chart/salarycolumn")
    @ResponseBody
    public JobData getChartSalaryColumn(String postcatid){
        logger.info("/jobs/chart/salarycolumn start postcatid="+postcatid);
        long startime=System.currentTimeMillis();
        JobData data;
        try{
            List<ChartFloatData> chartChartData =jobListService.getChartSalaryColumn(postcatid);
            data=JobData.success(chartChartData);
        }
        catch(Exception e){
            data=JobData.fail(e);
            e.printStackTrace();
        }
        logger.info("/jobs/chart/salarycolumn end 用时"+(System.currentTimeMillis()-startime));
        return  data;
    }
    @RequestMapping("/jobs/chart/citycountline")
    @ResponseBody
    public JobData getChartCityCountLine(String postids){
        logger.info("/jobs/chart/citycountline start postids="+postids);
        long startime=System.currentTimeMillis();
        JobData data;
        ChartLineData chartLineData=new ChartLineData();
        try{
            if(postids.contains(",")){
                String[] split = postids.split(",");
                jobListService.getChartCityCountLine(split,chartLineData.dataset);
            }
            else {
                jobListService.getChartCityCountLine(Integer.valueOf(postids),chartLineData.dataset);
            }
            data=JobData.success(chartLineData);

        }
        catch(Exception e){
            data=JobData.fail(e);
            e.printStackTrace();
        }
        logger.info("/jobs/chart/citycountline end 用时"+(System.currentTimeMillis()-startime));
        return  data;
    }

    @RequestMapping("/jobs/chart/citysalaryline")
    @ResponseBody
    public JobData getChartCitySalaryLine(String postids){
        logger.info("/jobs/chart/citysalaryline start postids="+postids);
        long startime=System.currentTimeMillis();
        JobData data;
        ChartLineData chartLineData=new ChartLineData();
        try{
            if(postids.contains(",")){
                String[] split = postids.split(",");
                jobListService.getChartCitySalaryLine(split, chartLineData.dataset);
            }
            else {
                jobListService.getChartCitySalaryLine(Integer.valueOf(postids), chartLineData.dataset);
            }

            data=JobData.success(chartLineData);

        }
        catch(Exception e){
            data=JobData.fail(e);
            e.printStackTrace();
        }
        logger.info("/jobs/chart/citysalaryline end 用时"+(System.currentTimeMillis()-startime));
        return  data;
    }

}
