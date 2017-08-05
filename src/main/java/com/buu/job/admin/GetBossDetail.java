package com.buu.job.admin;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
/**
 * Created by xianshengrong on 2017/3/4.
 */
public class GetBossDetail {


        public  Job getDetail(String id)  {
            Job job=null;
            try {

                Document doc = null;
                String url = "http://www.zhipin.com/job_detail/"+id+".html?ka=search_list_1";
                doc = JsoupConnector.getDocumentByUrl(url);
                job = analyze(doc);
                job.setJobId(Integer.valueOf(id));
                //insert(job);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return job;
        }

        private static Job analyze(Element root) {
            //try{
            Job job = new Job();
            job.setPostDepartment("null");
            //Elements name = root.select("[class=name]");
            Elements mboxjobs = root.select("[class=mbox jobs]");
            String[] string=mboxjobs.get(0).text().split(" ");
            job.setPost(string[0]);
            job.setSalary(string[1].replaceAll("￥",""));

            job.setWorkPlace(string[3]);
            job.setExperience("经验"+string[4]);
            job.setEducationBackground(string[5]);
            job.setJobKind("null");
            job.setPublishTime("null");
            job.setJobFrom("Boos直聘");
            job.setWelfare("null");

            Element job_bt = root.select("[class=info_text]").first();
            String text = job_bt.text();
//        System.out.println(text);//以下开始解析岗位职责和任职要求，解析失败都放到要求里。
            int dutyStart=2000;//岗位职责index
            int postRequestStart=2000;//岗位要求index
            if(text.contains("岗位职责")){
                dutyStart=text.indexOf("岗位职责");
            }
            else if(text.contains("工作职责")){
                dutyStart=text.indexOf("工作职责");
            }
            else if(text.contains("岗位描述")){
                dutyStart=text.indexOf("岗位描述");
            }
            else if(text.contains("职位职责")){
                dutyStart=text.indexOf("职位职责");
            }
            else if(text.contains("工作说明")){
                dutyStart=text.indexOf("工作说明");
            }
            else if(text.contains("职责说明")){
                dutyStart=text.indexOf("职责说明");
            }
            else if(text.contains("岗位说明")){
                dutyStart=text.indexOf("岗位说明");
            }
            else if(text.contains("职位说明")){
                dutyStart=text.indexOf("职位说明");
            }
            else if(text.contains("工作内容")){
                dutyStart=text.indexOf("工作内容");
            }
            else if(text.contains("职责内容")){
                dutyStart=text.indexOf("职责内容");
            }
            else if(text.contains("职位内容")){
                dutyStart=text.indexOf("职位内容");
            }
            else if(text.contains("岗位内容")){
                dutyStart=text.indexOf("岗位内容");
            }
            else if(text.contains("你将负责")){
                dutyStart=text.indexOf("你将负责");
            }
            if(text.contains("任职要求")){//任职要求是重点
                postRequestStart=text.indexOf("任职要求");
            }
            else if(text.contains("任职资格")){
                postRequestStart=text.indexOf("任职资格");
            }else if(text.contains("岗位要求")){
                postRequestStart=text.indexOf("岗位要求");
            }else if(text.contains("岗位资格")){
                postRequestStart=text.indexOf("岗位资格");
            }
            else if(text.contains("职位要求")){
                postRequestStart=text.indexOf("职位要求");
            }
            else if(text.contains("职位资格")){
                postRequestStart=text.indexOf("职位资格");
            }
            else if(text.contains("您要准备")){
                postRequestStart=text.indexOf("您要准备");
            }else if(text.contains("能力要求")){
                postRequestStart=text.indexOf("能力要求");
            }
            else if(text.contains("招聘要求")){
                postRequestStart=text.indexOf("招聘要求");
            }else if(text.contains("工作要求")){
                postRequestStart=text.indexOf("工作要求");
            }
            else if(text.contains("工作需求")){
                postRequestStart=text.indexOf("工作需求");
            }
            else if(text.contains("工作资格")){
                postRequestStart=text.indexOf("工作资格");
            }
            else if(text.contains("技能资格")){
                postRequestStart=text.indexOf("技能资格");
            }
            else if(text.contains("岗位需求")){
                postRequestStart=text.indexOf("岗位需求");
            }else if(text.contains("技能要求")){
                postRequestStart=text.indexOf("技能要求");
            }else if(text.contains("技能需求")){
                postRequestStart=text.indexOf("技能需求");
            }
            if(dutyStart==2000&&postRequestStart==2000){//解析失败
                job.setPostRequest(text);
            }
            if(dutyStart!=2000&&postRequestStart!=2000&&dutyStart<postRequestStart){
                if(dutyStart>0){//职责之前还有一部分内容，比如公司福利
                    String duty=text.substring(dutyStart+4,postRequestStart);
                    job.setDuty(duty);
                    String request=text.substring(0,dutyStart)+text.substring(postRequestStart+4);
                    job.setPostRequest(request);
                }
                else {
                    String duty=text.substring(dutyStart+4,postRequestStart);
                    job.setDuty(duty);
                    String request=text.substring(postRequestStart+4);
                    job.setPostRequest(request);
                }
            }
            if(dutyStart!=2000&&postRequestStart!=2000&&dutyStart>postRequestStart){
                String request=text.substring(0,dutyStart);
                job.setPostRequest(request);
                String duty=text.substring(dutyStart+4);
                job.setDuty(duty);

            }
            if(dutyStart!=2000&&postRequestStart==2000){
                if(dutyStart>0){
                    String duty=text.substring(dutyStart+4);
                    job.setDuty(duty);
                    String request=text.substring(0,dutyStart);
                    job.setPostRequest(request);
                }
                else {
                    String duty=text.substring(dutyStart+4);
                    job.setDuty(duty);
                }
            }

            if(dutyStart==2000&&postRequestStart!=2000){
                job.setPostRequest(text);
            }
            Elements work_addr = root.select("[class=item]");
            try {
                job.setPositionAddress(work_addr.get(3).text());

            }catch (IndexOutOfBoundsException e){
                job.setPositionAddress("null");

            }
            job.setCompanyName(work_addr.get(2).text());
            job.setCompanyHomePageURL(work_addr.get(1).text());
            String[] split = work_addr.get(0).text().split(" | ");
            job.setCompanyFeild(split[0].replaceAll(" ",""));
            job.setCompanyScale(split[4].replaceAll(" ",""));

            return job;

        }

        public static boolean isNumeric(String str){
            for (int i = 0; i < str.length(); i++){
                if (Character.isDigit(str.charAt(i))){
                    return true;
                }
            }
            return false;
        }







}
