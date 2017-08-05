package com.buu.job.service;

import com.buu.job.domain.ChartData;
import com.buu.job.domain.JobDetail;
import com.buu.job.domain.WordCloudData;

import java.util.List;

/**
 * Created by Administrator on 2016/11/17.
 */
public interface JobDetailService {
    JobDetail getJobDetailBypositionId(int positionId);

    List<ChartData> getChartDuty(String jobcat);

    List<WordCloudData> getChartPostRequest(String jobcat);
}
