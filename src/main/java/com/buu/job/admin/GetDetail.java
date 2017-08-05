package com.buu.job.admin;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by xianshengrong on 2017/1/8.
 */

public class GetDetail {

        /*
        * 获取详情数据
        * */
        public  Job getDetail(String id)  {
            Job job=null;
                try {
                    Thread.sleep(1000);
                    String filePath = "/Users/xianshengrong/毕业设计/jobs/";
                    Document doc = null;
                    String url = "http://www.lagou.com/jobs/"+id+".html";
                    //String url = "http://www.lagou.com/jobs/2330876.html";
                    doc = JsoupConnector.getDocumentByUrl(url);
                    //writeTofile(doc.toString(),filePath,id);
//                Element start = doc.select("[class=container clearfix]").first();
                     job = analyze(doc);
                    job.setJobId(Integer.valueOf(id));
                    insert(job);
//                    System.out.println(job.getAllInfo());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            return job;
        }

        private static Job analyze(Element root) {
            //try{
            Job job = new Job();
            Elements company1 = root.select("[class=company]");
            job.setPostDepartment(company1.first().text());
            Elements name = root.select("[class=name]");
            job.setPost(name.first().text());

            Elements job_request = root.select("[class=job_request]");
            Element job_info = job_request.get(0);
            job.setSalary(job_info.select("[class=salary]").first().text());
            Elements spans = job_info.getElementsByTag("span");
            String workpalce = spans.get(1).text();
            if(workpalce.contains("/")){
                workpalce=workpalce.replaceAll("/","");
            }
            String exp = spans.get(2).text();
            if(exp.contains("/")){
                exp=exp.replaceAll("/","");
            }
            String edu = spans.get(3).text();
            if(edu.contains("/")){
                edu=edu.replaceAll("/","");
            }
            String jobkind = spans.get(4).text();
            if(jobkind.contains("/")){
                jobkind=jobkind.replaceAll("/","");
            }
            job.setWorkPlace(workpalce);
            job.setExperience(exp);
            job.setEducationBackground(edu);
            job.setJobKind(jobkind);

            Elements publish_time = root.select("[class=publish_time]");
            String publish_timeStr= publish_time.first().text();
            String[] times = publish_timeStr.split(" ");
            job.setPublishTime(times[0]);
            job.setJobFrom(times[1].replace("发布于",""));
            Elements jobadvantages = root.select("[class= job-advantage]");
            String advantage = jobadvantages.get(0).text();
            job.setWelfare(advantage.replace("职位诱惑： ",""));

            Element job_bt = root.select("[class=job_bt]").first();
            String text = job_bt.text().substring(5);
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
            if(dutyStart==2000&&postRequestStart==2000){//解析失败"
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

            Element publisher = root.select("[class=publisher_name]").first();
            job.setJdPublisherName(publisher.getElementsByTag("a").first().attr("title"));
            job.setJdPublisherPost(publisher.getElementsByTag("span").get(1).text());

            Element publisher_data = root.select("[class=publisher_data]").first();
            String span = publisher_data.select("span").get(0).text().trim().replace("%", "");
            int k;
            try {
                k = Integer.parseInt(span);
            }catch (NumberFormatException e){
                k=-1;
            }
            job.setJdPublisherDealRatio(k);


            Element job_company = root.select("[class=content_r]").first().getElementById("job_company");
            Element a_first = job_company.getElementsByTag("a").first();
            job.setCompanyLagoHomePageURL(a_first.attr("href").substring(2));
            job.setCompanyIconURL(a_first.getElementsByTag("img").first().attr("src").substring(2));
            job.setCompanyName(a_first.getElementsByTag("img").first().attr("alt"));
            job.setCompanyNickName(a_first.getElementsByTag("h2").first().text().replace("拉钩认证企业", "").trim());

            Elements c_feature = root.select("[class=content_r]").first().select("[class=c_feature]");
            Elements c_li = c_feature.first().getElementsByTag("li");
            job.setCompanyFeild(c_li.get(0).text().split(" ")[0].trim());
            job.setCompanyDevelopeStage(c_li.get(1).text().split(" ")[0].trim());
            String scale=c_li.get(2).text().split(" ")[0].trim();
            if(isNumeric(scale)){
                job.setCompanyScale(scale);
                job.setCompanyHomePageURL(c_li.get(3).text().split(" ")[0].trim());
            }else{
                job.setCompanyScale(c_li.get(3).text().split(" ")[0].trim());
                job.setCompanyHomePageURL(c_li.get(4).text().split(" ")[0].trim());

            }

            Element work_addr = root.select("[class=work_addr]").first();
            job.setPositionAddress(work_addr.text().replaceAll(" ", ""));
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

        private static void log(String string) {

            File file=new File("c:\\rongjiabinlog.txt");
            FileWriter fileWriter=null;
            try {
                fileWriter = new FileWriter(file);
                fileWriter.append(string+"\r\n");
                fileWriter.flush();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            finally{
                if(fileWriter!=null){
                    try {
                        fileWriter.close();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

            }

        }
        private static boolean writeTofile(String job,String filePath,String id){
            try{
                boolean flag = true;
                StringBuilder job_file = new StringBuilder(filePath);
                job_file.append("/").append(id).append(".txt");
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream(job_file.toString(),false),
                        "UTF-8"));
                writer.write(job);
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
//		}catch (Exception e) {
//
//		}
//     	return false;
        }

        private static int insert(Job joblist) throws SQLException {
            Connection conn = getConn();
            int i = 0;
            String sql = "insert into job_detail  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt;
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, joblist.getPostDepartment());
            pstmt.setString(2, joblist.getPost());
            pstmt.setString(3, joblist.getSalary());
            pstmt.setString(4, joblist.getWorkPlace());
            pstmt.setString(5, joblist.getExperience());
            pstmt.setString(6, joblist.getEducationBackground());
            pstmt.setString(7, joblist.getJobKind());
            pstmt.setString(8, joblist.getWelfare());
            pstmt.setString(9, joblist.getPublishTime());
            pstmt.setString(10, joblist.getJobFrom());
            pstmt.setString(11, joblist.getDuty());
            pstmt.setString(12, joblist.getPostRequest());
            pstmt.setString(13, joblist.getPositionAddress());
            pstmt.setString(14, joblist.getJdPublisherName());
            pstmt.setString(15, joblist.getJdPublisherPost());
            pstmt.setInt(16, joblist.getJdPublisherDealRatio());
            pstmt.setString(17, joblist.getCompanyName());
            pstmt.setString(18, joblist.getCompanyNickName());
            pstmt.setString(19, joblist.getCompanyLagoHomePageURL());
            pstmt.setString(20, joblist.getCompanyIconURL());
            pstmt.setString(21, joblist.getCompanyFeild());
            pstmt.setString(22, joblist.getCompanyScale());
            pstmt.setString(23, joblist.getCompanyHomePageURL());
            pstmt.setString(24, joblist.getCompanyDevelopeStage());
            pstmt.setInt(25, joblist.getJobId());
            i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
            return i;
        }
        private static Connection getConn() {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/job?useUnicode=true&characterEncoding=utf-8";
            String username = "root";
            String password = "rjb19950628";
            Connection conn = null;
            try {
                Class.forName(driver); //classLoader,加载对应驱动
                conn = (Connection) DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return conn;
        }



}
