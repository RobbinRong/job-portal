package com.buu.job.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.buu.job.constants.Citys;
import com.buu.job.domain.*;
import com.buu.job.mapper.JobCatMapper;
import com.buu.job.mapper.JobListMapper;
import com.buu.job.service.JobListService;
import com.buu.job.utils.JedisClient;
import com.buu.job.utils.JsonUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.util.*;

/**
 * Created by Administrator on 2016/11/16.
 */
@SuppressWarnings("LossyEncoding")
@Service
public class JobListServiceImpl implements JobListService {

    @Autowired
    public JobListMapper jobListMapper;
    @Autowired
    public JobCatMapper jobCatMapper;
    @Autowired
    JedisClient jedisClient;
    public Page getJobsByPage(List<Integer> positionids,Param param,int page,int rows) {
        String city=param.getCity();
        String wy=param.getWy();
        String edu=param.getEdu();
        String rz=param.getRz();
        String field=param.getField();
        int sort=param.getSort();
        String sal=param.getSal();
        String nature=param.getNature();
        String jobCat=param.getJobCat();
        Page<JobList> pageData=new Page<JobList>();
        JobListExample example=new JobListExample();
        JobListExample.Criteria criteria = example.createCriteria();
        if(!"null".equals(city)){
            criteria.andCityEqualTo(city);
        }
        if(!"null".equals(wy)){
            if(wy.contains(",")){
                String[] split = wy.split(",");
                criteria.andWorkyearIn(Arrays.asList(split));
            }else {
                criteria.andWorkyearEqualTo(wy);
            }
        }
        if(!"null".equals(edu)){
            if(edu.contains(",")){
                String[] split = edu.split(",");
                criteria.andEducationIn(Arrays.asList(split));
            }else {
                criteria.andEducationEqualTo(edu);
            }
        }
        if(!"null".equals(rz)){
            if(rz.contains(",")){//由于前台只有不需要融资，所以要用like，多选情况下有待开发
                String[] split = rz.split(",");
                criteria.andFinancestageIn(Arrays.asList(split));
            }else {
                criteria.andFinancestageEqualTo(rz);
            }
        }
        if(!"null".equals(field)){
            if(field.contains(",")){
                String[] split = field.split(",");
                criteria.andIndustryfieldIn(Arrays.asList(split));
            }else {
                criteria.andIndustryfieldLike("%" + field + "%");
            }
        }
        if(sort==1){
            example.setOrderByClause("createTime desc");
        }
        if(!"null".equals(sal)){
            String[] hopeSal = sal.split("-");
            int hopeMin=Integer.valueOf(hopeSal[0].replace("k", ""));
            int hopeMax=Integer.valueOf(hopeSal[1].replace("k", ""));
            criteria.andSalaryBetween(hopeSal[0],hopeSal[1]);
        }
        if(!"null".equals(nature)){
            criteria.andJobnatureEqualTo(nature);
        }
        Integer id=getPostIdByName(jobCat);
        criteria.andPositioncatidEqualTo(id);
        if(!positionids.isEmpty()){
            criteria.andPositionidIn(positionids);
        }
        PageHelper.startPage(page, rows);
        List<JobList> list = jobListMapper.selectByExample(example);
        PageInfo<JobList> pageInfo = new PageInfo<JobList>(list);
        pageData.setTotal((int) pageInfo.getTotal());
        pageData.setPage(page);
        pageData.setRows(rows);
        pageData.setList(list);
        return pageData;
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
    public List<ChartData> getChartPostCount(String postcatid) {//21 125 技术 126 138 产品 139 168 设计
        String str=jedisClient.get("chartpostcount"+postcatid);
        List<ChartData> result=new ArrayList<ChartData>();
        if(!StringUtils.isEmpty(str)){
            result= JsonUtils.jsonToList(str,ChartData.class);
            return  result;
        }
        JobCatExample example=new JobCatExample();
        JobCatExample.Criteria criteria = example.createCriteria();

        BeginEnd beginEnd = calBeginEnd(postcatid);
        criteria.andIdBetween(beginEnd.begin,beginEnd.end);
        List<JobCat> jobCats = jobCatMapper.selectByExample(example);
        JobListExample jobListExample=new JobListExample();
        for (JobCat jobCat:jobCats){
            JobListExample.Criteria jobListExampleCriteria = jobListExample.createCriteria();
            jobListExampleCriteria.andPositioncatidEqualTo(jobCat.getId());
            int i = jobListMapper.countByExample(jobListExample);
            result.add(new ChartData(jobCat.getPositionName(),i));
            jobListExample.clear();
        }
        Collections.sort(result);
        String s1 = JsonUtils.objectToJson(result);
        jedisClient.set("chartpostcount"+postcatid,s1);
        jedisClient.expire("chartpostcount"+postcatid,10);
        return result;
    }

    public List<ChartData> getChartFiled(String postId) {
        String post =getPostNameById(Integer.valueOf(postId));
        List<ChartData> result=new ArrayList<ChartData>();
        String str=jedisClient.get("chartfield"+postId);
        if(!StringUtils.isEmpty(str)){
            result= JsonUtils.jsonToList(str,ChartData.class);
            return  result;
        }
        List<String> fields ;
        if(post.equals("null")){
            fields=jobListMapper.selectFieldNoId();
        }
        else {
            Integer catId = getPostIdByName(post);
            fields=jobListMapper.selectField(catId);
        }
        ArrayList<String> finalFields=new ArrayList<String>();
        int size=fields.size();
        for (int i=0;i<size;i++){
            String s = fields.get(i);
            if(s==null){
                continue;
            }
            s = s.replaceAll(" ", "");
            if(s.contains(",")){
                String[] split = s.split(",");
                finalFields.addAll(Arrays.asList(split));
            }
            else if(s.contains("，")){
                String[] split = s.split("，");
                finalFields.addAll(Arrays.asList(split));
            }
            else if(s.contains("、")){
                String[] split = s.split("、");
                finalFields.addAll(Arrays.asList(split));
            }else {
                finalFields.add(s);
            }
        }
        HashMap<String, Integer> hashMap = makeHashMap(finalFields);
        Iterator iter = hashMap.entrySet().iterator();
        while (iter.hasNext()) {
        Map.Entry<String,Integer> entry = (Map.Entry) iter.next();
            Integer value = entry.getValue();
            if(value<10){//过滤比重太小的数据
                continue;
            }
            result.add(new ChartData(entry.getKey(),value));
        }
        String s1 = JsonUtils.objectToJson(result);
        jedisClient.set("chartfield"+postId,s1);
        jedisClient.expire("chartfield"+postId,10);
        return result;
    }

    public List<ChartData> getChartCompanySize(Integer postId) {
        String post =getPostNameById(postId);
        List<ChartData> result=new ArrayList<ChartData>();
        String str=jedisClient.get("chartcompanysize"+postId);
        if(!StringUtils.isEmpty(str)){
            result= JsonUtils.jsonToList(str,ChartData.class);
            return  result;
        }
        List<String> companySizes;
        if(post.equals("null")){
            companySizes=jobListMapper.selectCompanySizeNoId();
        }
        else {
            Integer catId = getPostIdByName(post);
            companySizes=jobListMapper.selectCompanySize(catId);
        }
        HashMap<String, Integer> hashMap = makeHashMap(companySizes);
        Iterator iter = hashMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String,Integer> entry = (Map.Entry) iter.next();
            result.add(new ChartData(entry.getKey(),entry.getValue()));
        }
        String s1 = JsonUtils.objectToJson(result);
        jedisClient.set("chartcompanysize"+postId,s1);
        jedisClient.expire("chartcompanysize"+postId,10);
        return result;
    }
    private HashMap<String,Integer> makeHashMap(List<String> list){
        HashMap<String ,Integer> hashMap=new HashMap<String, Integer>();
        int finalFieldsSize=list.size();
        for (int i=0;i<finalFieldsSize;i++){
            String key=list.get(i);
            if(hashMap.containsKey(key)){
                Integer integer = hashMap.get(key);
                hashMap.put(key,++integer);
            }
            else {
                hashMap.put(key,1);
            }
        }
        return hashMap;
    }

    public List<ChartData> getChartFinanceStagePie(String postId) {
        String post =getPostNameById(Integer.valueOf(postId));
        List<ChartData> result=new ArrayList<ChartData>();
        String str=jedisClient.get("chartfinancestagepie"+postId);
        if(!StringUtils.isEmpty(str)){
            result= JsonUtils.jsonToList(str,ChartData.class);
            return  result;
        }
        List<String> financeStages;
        if(post.equals("null")){
            financeStages=jobListMapper.selectFinanceStageNoId();
        }
        else {
            Integer catId = getPostIdByName(post);
            financeStages=jobListMapper.selectFinanceStage(catId);
        }
        HashMap<String, Integer> hashMap = makeHashMap(financeStages);
        Iterator iter = hashMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String,Integer> entry = (Map.Entry) iter.next();
            Integer value = entry.getValue();
            String key = entry.getKey();
            if(value<50){//过滤比重太小的数据
                continue;
            }
            result.add(new ChartData(key,value));
        }
        String s1 = JsonUtils.objectToJson(result);
        jedisClient.set("chartfinancestagepie"+postId,s1);
        jedisClient.expire("chartfinancestagepie"+postId,10);
        return result;
    }


    private List<ChartFloatData> getSalaryData(int start,int end){
        List<ChartFloatData> result=new ArrayList<ChartFloatData>();
        JobListExample jobListExample=new JobListExample();
        List<JobList> jobLists;
        for(int i=start;i<=end;i++){
            JobListExample.Criteria jobListExampleCriteria = jobListExample.createCriteria();
            jobListExampleCriteria.andPositioncatidEqualTo(i);
            jobLists = jobListMapper.selectByExample(jobListExample);
            float avgSalaryValue = calAvgSalary(jobLists);
            result.add(new ChartFloatData(getPostNameById(i),avgSalaryValue));
            jobListExample.clear();

        }
        return  result;
    }
    private BeginEnd calBeginEnd(String postcatid){
        int begin=21,end=168;
        if(postcatid.equals("0")){
            begin=21;
            end=168;
        }
        else if(postcatid.equals("1")){
            begin=21;
            end=125;
        }else if(postcatid.equals("2")){
            begin=126;
            end=138;
        }else if(postcatid.equals("3")){
            begin=139;
            end=168;
        }
        else{
            JobCatExample jobCatExample=new JobCatExample();
            JobCatExample.Criteria jobCatExampleCriteria = jobCatExample.createCriteria();
            jobCatExampleCriteria.andParentIdEqualTo(Integer.valueOf(postcatid));
            jobCatExample.setOrderByClause("id");
            List<JobCat> jobCats = jobCatMapper.selectByExample(jobCatExample);
            begin=jobCats.get(0).getId();
            end=jobCats.get(jobCats.size()-1).getId();
        }
        BeginEnd beginEnd=new BeginEnd();
        beginEnd.begin=begin;
        beginEnd.end=end;
        return beginEnd;
    }
    public List<ChartFloatData> getChartSalaryColumn(String postcatid) {
        List<ChartFloatData> result=null;
        String str=jedisClient.get("ChartSalaryColumn"+postcatid);
        if(!StringUtils.isEmpty(str)){
            result= JsonUtils.jsonToList(str,ChartFloatData.class);
            return  result;
        }
        BeginEnd beginEnd = calBeginEnd(postcatid);
        result = getSalaryData(beginEnd.begin, beginEnd.end);
        String s1 = JsonUtils.objectToJson(result);
        jedisClient.set("ChartSalaryColumn"+postcatid,s1);
        jedisClient.expire("ChartSalaryColumn"+postcatid,10);
        return result;
    }

    public ChartLineData getChartCityCountLine(String[] postids,List<DataSet> dataSets) {
        for(int i=0;i<postids.length;i++){
            getChartCityCountLine(Integer.valueOf(postids[i]),dataSets);
        }
        return null;
    }

    public ChartLineData getChartCityCountLine(Integer postid,List<DataSet> dataSets) {
        DataSet dataSet = new DataSet();
        ChartLineData result =new ChartLineData();
        String str=jedisClient.get("ChartCityCountLine"+postid);
        if(!StringUtils.isEmpty(str)){
            dataSet= JsonUtils.jsonToPojo(str,DataSet.class);
            dataSets.add(dataSet);
            return result;
        }
        String postName = getPostNameById(postid);
        dataSet.seriesname=postName;
        for(int i=0;i< Citys.CHARTCITYCOUNTLINE.length;i++){
            JobListExample example=new JobListExample();
            JobListExample.Criteria criteria = example.createCriteria();
            criteria.andPositioncatidEqualTo(postid);
            criteria.andCityEqualTo(Citys.CHARTCITYCOUNTLINE[i]);
            int count = jobListMapper.countByExample(example);
            dataSet.data.add(new Data(String.valueOf(count)));
        }
        dataSets.add(dataSet);
        String s1 = JsonUtils.objectToJson(dataSet);
        jedisClient.set("ChartCityCountLine"+postid,s1);
        jedisClient.expire("ChartCityCountLine"+postid,10);
        return result;
    }

    public void getChartCitySalaryLine(String[] postids, List<DataSet> dataSets) {
        for(int i=0;i<postids.length;i++){
            getChartCitySalaryLine(Integer.valueOf(postids[i]), dataSets);
        }
    }

    public void getChartCitySalaryLine(Integer postid, List<DataSet> dataSets) {
        String str=jedisClient.get("ChartCitySalaryLine"+postid);
        DataSet dataSet = new DataSet();
        if(!StringUtils.isEmpty(str)){
            dataSet= JsonUtils.jsonToPojo(str,DataSet.class);
            dataSets.add(dataSet);
            return;
        }
        String postName = getPostNameById(postid);
        dataSet.seriesname=postName;
        for(int i=0;i< Citys.CHARTCITYCOUNTLINE.length;i++){
            JobListExample example=new JobListExample();
            JobListExample.Criteria criteria = example.createCriteria();
            criteria.andPositioncatidEqualTo(postid);
            criteria.andCityEqualTo(Citys.CHARTCITYCOUNTLINE[i]);
            List<JobList> jobLists = jobListMapper.selectByExample(example);
            float v = calAvgSalary(jobLists);
            dataSet.data.add(new Data(String.valueOf(v)));
        }
        dataSets.add(dataSet);
        String s1 = JsonUtils.objectToJson(dataSet);
        jedisClient.set("ChartCitySalaryLine"+postid,s1);
        jedisClient.expire("ChartCitySalaryLine"+postid,10);
    }

    public Page getJobListByids(List<String> positionids) {
        Page<JobList> page=new Page<JobList>();
        List<JobList> lists=new ArrayList<JobList>();
        for (String id:positionids){
            JobList jobList = jobListMapper.selectByPrimaryKey(Integer.valueOf(id));
            lists.add(jobList);
        }
        page.setTotal(1000);
        page.setPage(1);
        page.setRows(10);
        page.setParam(new Param("null","null","null","null","null","null",1,"null","null"));
        page.setList(lists);
        return page;
    }

    private float calAvgSalary(List<JobList> jobLists){
        int size = jobLists.size();
        float sum=0;
        for (int i=0;i<size;i++){
            JobList jobList = jobLists.get(i);
            String salary = jobList.getSalary();
            String[] ks = salary.replaceAll("k", "").replaceAll("K", "").replaceAll("以上", "").replaceAll("\\+","").split("-");
            if(ks.length==2){
                sum+=(Integer.valueOf(ks[0])+Integer.valueOf(ks[1]))/2.0;
            }
            else {
                sum+=Integer.valueOf(salary.replaceAll("k", "").replaceAll("K", "").replaceAll("以上", "").replaceAll("以下", "").replaceAll("\\+",""));
            }
        }
        return  sum/size;

    }


}
