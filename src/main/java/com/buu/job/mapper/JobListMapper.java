package com.buu.job.mapper;

import com.buu.job.domain.JobList;
import com.buu.job.domain.JobListExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface JobListMapper {

    @Select("select industryField from job_list where positionCatId=#{catId}")
    List<String> selectField(Integer catId);
    @Select("select industryField from job_list")
    List<String> selectFieldNoId();

    @Select("select companySize from job_list where positionCatId=#{catId}")
    List<String> selectCompanySize(Integer catId);
    @Select("select companySize from job_list")
    List<String> selectCompanySizeNoId();

    @Select("select financeStage from job_list where positionCatId=#{catId}")
    List<String> selectFinanceStage(Integer catId);
    @Select("select financeStage from job_list")
    List<String> selectFinanceStageNoId();


    @Select("select positionid from job_list where positionCatId=#{catId}")
    List<Integer> selectPositionId(Integer catId);
    int countByExample(JobListExample example);

    int deleteByExample(JobListExample example);

    int deleteByPrimaryKey(Integer positionid);

    int insert(JobList record);

    int insertSelective(JobList record);

    List<JobList> selectByExample(JobListExample example);

    JobList selectByPrimaryKey(Integer positionid);

    int updateByExampleSelective(@Param("record") JobList record, @Param("example") JobListExample example);

    int updateByExample(@Param("record") JobList record, @Param("example") JobListExample example);

    int updateByPrimaryKeySelective(JobList record);

    int updateByPrimaryKey(JobList record);
}