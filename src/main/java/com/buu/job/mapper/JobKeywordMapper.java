package com.buu.job.mapper;

import com.buu.job.domain.JobKeyword;
import com.buu.job.domain.JobKeywordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobKeywordMapper {
    int countByExample(JobKeywordExample example);

    int deleteByExample(JobKeywordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobKeyword record);

    int insertSelective(JobKeyword record);

    List<JobKeyword> selectByExample(JobKeywordExample example);

    JobKeyword selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobKeyword record, @Param("example") JobKeywordExample example);

    int updateByExample(@Param("record") JobKeyword record, @Param("example") JobKeywordExample example);

    int updateByPrimaryKeySelective(JobKeyword record);

    int updateByPrimaryKey(JobKeyword record);
}