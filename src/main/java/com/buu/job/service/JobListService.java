package com.buu.job.service;

import com.buu.job.domain.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Administrator on 2016/11/16.
 */
public interface JobListService {
//    Page getJobsByPage(String jobCat, String city, String wy, String edu,
//                       String rz, String field, int sort, String sal, String nature,int page,int rows);
    Page getJobsByPage(List<Integer> positionids,Param param,int page,int rows);

    List<ChartData> getChartPostCount(String postcatid);
    List<ChartData> getChartFiled(String post);

    List<ChartData> getChartCompanySize(Integer postId);

    List<ChartData> getChartFinanceStagePie(String post);

    List<ChartFloatData> getChartSalaryColumn(String post);

    ChartLineData getChartCityCountLine(String [] postids,List<DataSet> dataSets);
    ChartLineData getChartCityCountLine(Integer postid,List<DataSet> dataSets);

    void getChartCitySalaryLine(String[] split, List<DataSet> dataSets);
    void getChartCitySalaryLine(Integer postid,List<DataSet> dataSets);

    Page getJobListByids(List<String> positionids);
}
