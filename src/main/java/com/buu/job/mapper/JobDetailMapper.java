package com.buu.job.mapper;

import com.buu.job.domain.JobDetail;
import com.buu.job.domain.JobDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JobDetailMapper {
    int countByExample(JobDetailExample example);

    int deleteByExample(JobDetailExample example);

    int deleteByPrimaryKey(Integer positionid);

    int insert(JobDetail record);

    int insertSelective(JobDetail record);

    List<JobDetail> selectByExample(JobDetailExample example);

    JobDetail selectByPrimaryKey(Integer positionid);

    int updateByExampleSelective(@Param("record") JobDetail record, @Param("example") JobDetailExample example);

    int updateByExample(@Param("record") JobDetail record, @Param("example") JobDetailExample example);

    int updateByPrimaryKeySelective(JobDetail record);

    int updateByPrimaryKey(JobDetail record);
}