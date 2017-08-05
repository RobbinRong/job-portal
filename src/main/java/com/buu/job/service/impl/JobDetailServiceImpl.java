package com.buu.job.service.impl;

import com.buu.job.domain.*;
import com.buu.job.mapper.JobCatMapper;
import com.buu.job.mapper.JobDetailMapper;
import com.buu.job.mapper.JobKeywordMapper;
import com.buu.job.mapper.JobListMapper;
import com.buu.job.service.JobDetailService;
import com.buu.job.utils.JedisClient;
import com.hankcs.hanlp.seg.common.Term;
import com.hankcs.hanlp.tokenizer.NLPTokenizer;
import jeasy.analysis.MMAnalyzer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.*;

/**
 * Created by Administrator on 2016/11/16.
 */
@Service
public class JobDetailServiceImpl implements JobDetailService{

    @Autowired
    JobDetailMapper jobDetailMapper;
    @Autowired
    JobCatMapper jobCatMapper;
    @Autowired
    JobListMapper jobListMapper;
    @Autowired
    JobKeywordMapper jobKeywordMapper;


    private MMAnalyzer analyzer=new MMAnalyzer();
    public JobDetail getJobDetailBypositionId(int positionId) {
        JobDetail jobDetail = jobDetailMapper.selectByPrimaryKey(positionId);
        return jobDetail;
    }

    public List<ChartData> getChartDuty(String jobcat) {
        List<JobDetail> chartDetailData = getChartDetailData(jobcat);
        StringBuilder sb=new StringBuilder();
        int size = chartDetailData.size();
        try {
            for (int i=0;i<size;i++){
                JobDetail jobDetail = chartDetailData.get(i);
                if(jobDetail==null){
                    continue;
                }
                String duty =jobDetail.getDuty();
                if(duty==null||duty==""){
                    continue;
                }
                sb.append(analyzer.segment(duty, "|"));
        }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(sb.toString());
        return null;

    }

    public List<WordCloudData> getChartPostRequest(String jobcatId) {
        JobKeywordExample example=new JobKeywordExample();
        JobKeywordExample.Criteria criteria = example.createCriteria();
        criteria.andPositioncatidEqualTo(Integer.valueOf(jobcatId));
        List<JobKeyword> jobKeywords = jobKeywordMapper.selectByExample(example);
        List<WordCloudData> result=new ArrayList<WordCloudData>();
        System.out.println(jobKeywords.size());
        for(JobKeyword keyword:jobKeywords){
            String label = keyword.getKeyword();
            int value=keyword.getCount();
            Normal normal=new Normal();
            Random random=new Random();
            normal.setColor("rgb("+random.nextInt(256)+","+random.nextInt(256)+","+random.nextInt(256)+")");
            ItemStyle itemStyle=new ItemStyle();
            itemStyle.setNormal(normal);
            result.add(new WordCloudData(label,value,itemStyle));
        }
        Collections.sort(result);
        return result;
    }

    private List<JobDetail> getChartDetailData(String jobcat){
        Integer positioncatid = getPostIdByName(jobcat);
        List<Integer> ids = jobListMapper.selectPositionId(positioncatid);
        JobDetailExample example=new JobDetailExample();
        JobDetailExample.Criteria criteria = example.createCriteria();
        criteria.andPositionidIn(ids);
        List<JobDetail> jobDetails = jobDetailMapper.selectByExample(example);
        return jobDetails;
    }
    private Integer getPostIdByName(String postCatName){
        JobCatExample jobCatExample=new JobCatExample();
        JobCatExample.Criteria jobCatExampleCriteria= jobCatExample.createCriteria();
        jobCatExampleCriteria.andPositionNameEqualTo(postCatName);
        List<JobCat> jobCats = jobCatMapper.selectByExample(jobCatExample);
        Integer id = jobCats.get(0).getId();
        return id;
    }

    private String getPostNameById(int postCatId){
        JobCatExample jobCatExample=new JobCatExample();
        JobCat jobCat = jobCatMapper.selectByPrimaryKey(postCatId);
        return jobCat.getPositionName();
    }
}
