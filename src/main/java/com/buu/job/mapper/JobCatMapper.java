package com.buu.job.mapper;

import com.buu.job.domain.JobCat;
import com.buu.job.domain.JobCatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobCatMapper {
    int countByExample(JobCatExample example);

    int deleteByExample(JobCatExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobCat record);

    int insertSelective(JobCat record);

    List<JobCat> selectByExample(JobCatExample example);

    JobCat selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobCat record, @Param("example") JobCatExample example);

    int updateByExample(@Param("record") JobCat record, @Param("example") JobCatExample example);

    int updateByPrimaryKeySelective(JobCat record);

    int updateByPrimaryKey(JobCat record);
}