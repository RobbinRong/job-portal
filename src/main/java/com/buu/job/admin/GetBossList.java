package com.buu.job.admin;

import java.sql.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

/**
 * Created by xianshengrong on 2017/3/4.
 */
public class GetBossList {
    public static void main(String[] args) {
        getList();
    }

    public static void getList() {
        HashMap<String,String> jobs=new HashMap<String,String>();
        jobs.put("c101010100-p100101","Java");
        jobs.put("c101010100-p100109","Python");
        jobs.put("c101010100-p100103","PHP");
        jobs.put("c101010100-p100107",".NET");
        jobs.put("c101010100-p100106","C#");
        jobs.put("c101010100-p100102","C++");
        jobs.put("c101010100-p100105","C");
        jobs.put("c101010100-p100111","VB");
        jobs.put("c101010100-p100110","Delphi");
        jobs.put("c101010100-p100112","Perl");
        jobs.put("c101010100-p100113","Ruby");
        jobs.put("c101010100-p100108","Hadoop");
        jobs.put("c101010100-p100114","Node.js");
        jobs.put("c101010100-p100104","数据挖掘");
        jobs.put("c101010100-p100117","自然语言处理");
        jobs.put("c101010100-p100115","搜索算法");
        jobs.put("c101010100-p100118","精准推荐");
        jobs.put("c101010100-p100116","Go");
        jobs.put("c101010100-p100201","HTML5");
        jobs.put("c101010100-p100904","HTML5");
        jobs.put("c101010100-p100202","Android");
        jobs.put("c101010100-p100203","iOS");
        jobs.put("c101010100-p100204","WP");
        jobs.put("c101010100-p100205","web前端");
        jobs.put("c101010100-p100901","web前端");
        jobs.put("c101010100-p100206","Flash");
        jobs.put("c101010100-p100903","Flash");
        jobs.put("c101010100-p100208","JavaScript");
        jobs.put("c101010100-p100902","JavaScript");
        jobs.put("c101010100-p100209","U3D");
        jobs.put("c101010100-p100210","COCOS2D-X");
        jobs.put("c101010100-p100301","测试工程师");
        jobs.put("c101010100-p100302","自动化测试");
        jobs.put("c101010100-p100303","功能测试");
        jobs.put("c101010100-p100304","性能测试");
        jobs.put("c101010100-p100305","测试开发");
        jobs.put("c101010100-p100307","游戏测试");
        jobs.put("c101010100-p100306","手机测试");
        jobs.put("c101010100-p100308","硬件测试");
        jobs.put("c101010100-p100703","测试经理");
        jobs.put("c101010100-p100401","运维工程师");
        jobs.put("c101010100-p100402","运维开发工程师");
        jobs.put("c101010100-p100403","网络工程师");
        jobs.put("c101010100-p100404","系统工程师");
        jobs.put("c101010100-p100405","IT支持");
        jobs.put("c101010100-p100406","系统管理员");
        jobs.put("c101010100-p100407","网络安全");
        jobs.put("c101010100-p100408","系统安全");
        jobs.put("c101010100-p100501","MySQL");
        jobs.put("c101010100-p100502","SQLServer");
        jobs.put("c101010100-p100503","Oracle");
        jobs.put("c101010100-p100504","DB2");
        jobs.put("c101010100-p100505","MongoDB");
        jobs.put("c101010100-p100506","Hive");
        jobs.put("c101010100-p100507","数据仓库");
        jobs.put("c101010100-p100509","数据挖掘");
        jobs.put("c101010100-p100601","项目经理");
        jobs.put("c101010100-p100603","项目助理");
        jobs.put("c101010100-p100602","项目总监");
        jobs.put("c101010100-p100606","实施工程师");
        jobs.put("c101010100-p100801","硬件");
        jobs.put("c101010100-p100802","嵌入式");
        jobs.put("c101010100-p100803","自动化");
        jobs.put("c101010100-p100804","单片机");
        jobs.put("c101010100-p100805","电路设计");
        jobs.put("c101010100-p100806","驱动开发");
        jobs.put("c101010100-p100807","系统集成");
        jobs.put("c101010100-p100808","FPGA开发");
        jobs.put("c101010100-p100809","DSP开发");
        jobs.put("c101010100-p100810","ARM开发");
        jobs.put("c101010100-p100811","PCB工艺");
        jobs.put("c101010100-p100812","模具设计");
        jobs.put("c101010100-p100813","热传导");
        jobs.put("c101010100-p100814","材料工程师");
        jobs.put("c101010100-p100815","精益工程师");
        jobs.put("c101010100-p100816","射频工程师");
        jobs.put("c101010100-p101201","售前工程师");
        jobs.put("c101010100-p101202","售后工程师");
        jobs.put("c101010100-p100705","CTO");
        jobs.put("c101010100-p100705","架构师");
        jobs.put("c101010100-p100706","运维总监");
        jobs.put("c101010100-p100707","技术合伙人");
        jobs.put("c101010100-p100701","技术经理");
        jobs.put("c101010100-p100702","技术总监");
        jobs.put("c101010100-p110101","产品经理");
        jobs.put("c101010100-p110102","网页产品经理");
        jobs.put("c101010100-p110103","移动产品经理");
        jobs.put("c101010100-p110104","产品助理");
        jobs.put("c101010100-p110105","数据产品经理");
        jobs.put("c101010100-p110106","电商产品经理");
        jobs.put("c101010100-p110107","游戏策划");
        jobs.put("c101010100-p110201","网页产品设计师");
        jobs.put("c101010100-p110202","无线产品设计师");
        jobs.put("c101010100-p110301","产品部经理");
        jobs.put("c101010100-p110302","产品总监");
        jobs.put("c101010100-p110303","游戏制作人");
        jobs.put("c101010100-p120101","视觉设计师");
        jobs.put("c101010100-p120102","网页设计师");
        jobs.put("c101010100-p120103","Flash设计师");
        jobs.put("c101010100-p120104","APP设计师");
        jobs.put("c101010100-p120105","UI设计师");
        jobs.put("c101010100-p120106","平面设计师");
        jobs.put("c101010100-p120107","美术设计师（2D/3）");
        jobs.put("c101010100-p120108","广告设计师");
        jobs.put("c101010100-p120109","多媒体设计师");
        jobs.put("c101010100-p120110","原画师");
        jobs.put("c101010100-p120111","游戏特效");
        jobs.put("c101010100-p120112","游戏界面设计师");
        jobs.put("c101010100-p120113","游戏场景");
        jobs.put("c101010100-p120114","游戏角色");
        jobs.put("c101010100-p120115","游戏动作");
        jobs.put("c101010100-p120201","交互设计师");
        jobs.put("c101010100-p120202","无线交互设计师");
        jobs.put("c101010100-p120203","网页交互设计师");
        jobs.put("c101010100-p120204","硬件交互设计师");
        jobs.put("c101010100-p120301","数据分析师");
        jobs.put("c101010100-p120302","用户研究员");
        jobs.put("c101010100-p120303","游戏数值策划");
        jobs.put("c101010100-p120401","设计经理/主管");
        jobs.put("c101010100-p120402","设计总监");
        jobs.put("c101010100-p120403","视觉设计经理/主管");
        jobs.put("c101010100-p120404","视觉设计总监");
        jobs.put("c101010100-p120405","交互设计经理/主管");
        jobs.put("c101010100-p120406","交互设计总监");
        jobs.put("c101010100-p120407","用户研究经理/主管");
        jobs.put("c101010100-p120408","用户研究总监");
        Set<Map.Entry<String, String>> entries = jobs.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        Random random=new Random();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            for (int j = 1; j <= 30; j++) {
                try {
                    int i = random.nextInt(15000);
                    System.out.println(i);
                    Thread.sleep(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    continue;
                }
                String url = "http://www.zhipin.com/"+next.getKey()+"/?page=" + j + "&ka=page-" + j;
                System.out.println(url);
                Document doc = JsoupConnector.getDocumentByUrl(url);
                if (doc == null) {
                    continue;
                }
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                Elements job_list = doc.select("[class=job-list]");
                Elements ul = job_list.get(0).getElementsByTag("ul");
                Elements li = ul.get(0).getElementsByTag("li");
                int size = li.size();
                GetBossDetail detail = new GetBossDetail();
                for (int i = 0; i < size; i++) {
                    Element root = li.get(i);
                    if (root == null) {
                        continue;
                    }
                    Element a = root.getElementsByTag("a").first();
                    String href = a.attr("href");
                    String[] split2 = href.split("/");
                    String positionId = split2[2].replaceAll(".html", "");
                    Job job = detail.getDetail(positionId);
                    job.setCompanyNickName(root.select("[class=name]").get(1).text());
                    String time = root.select("[class=time]").get(0).text().replaceAll("发布于", "");
                    String finalTime = null;

                    if ("昨天".equals(time)) {
                        Date date = new Date();//取时间
                        Calendar calendar = new GregorianCalendar();
                        calendar.setTime(date);
                        calendar.add(calendar.DATE, -1);//把日期往后增加一天.整数往后推,负数往前移动
                        date = calendar.getTime(); //这个时间就是日期往后推一天的结果
                        finalTime = df.format(date).toString();
                    } else if (time.contains("月")) {
                        time = time.replaceAll("月", "-").replaceAll("日", "-");
                        finalTime = "2017-" + time;
                    } else {
                        finalTime = df.format(new Date()).toString();
                    }
                    job.setPublishTime(finalTime);
                    System.out.println(job);
                    if (job == null) {
                        continue;
                    }
                    try {
                        insert(job,next.getValue());
                        insertDetail(job);
                    } catch (Exception e) {
                        e.printStackTrace();
                        continue;
                    }
                }

            }

        }

    }


    private static int insert(Job joblist,String positionNameCat) throws SQLException {
        Connection conn = getConn();
        int i = 0;
        PreparedStatement pstmt;
        String sqlSelectId = "SELECT id FROM job_cat WHERE  position_name= ?";
        pstmt = (PreparedStatement) conn.prepareStatement(sqlSelectId);
        pstmt.setString(1, positionNameCat);
        ResultSet set = pstmt.executeQuery();
        set.next();
        int positionCatId = set.getInt(1);
        pstmt.close();
        set.close();

        String sql = "insert into job_list  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pstmt = (PreparedStatement) conn.prepareStatement(sql);
        pstmt.setInt(1, joblist.getJobId());
        pstmt.setInt(2, 0);
        pstmt.setInt(3, 0);
        pstmt.setString(4, joblist.getPost());
        pstmt.setString(5, joblist.getPublishTime());
        pstmt.setString(6, joblist.getJobKind());
        pstmt.setString(7, joblist.getExperience());
        pstmt.setString(8, joblist.getEducationBackground());
        pstmt.setString(9, joblist.getWorkPlace());
        pstmt.setString(10, joblist.getCompanyIconURL());
        pstmt.setString(11, joblist.getWelfare().replaceAll("职位诱惑 :", ""));
        pstmt.setString(12, joblist.getSalary());
        pstmt.setInt(13, 1);
        pstmt.setString(14, joblist.getCompanyFeild());
        pstmt.setString(15, joblist.getCompanyNickName().replaceAll("拉勾认证企业", ""));
        pstmt.setString(16, "null");
        pstmt.setString(17, joblist.getCompanyScale());
        pstmt.setString(18, joblist.getWelfare().replaceAll("职位诱惑 :", ""));
        pstmt.setString(19, "null");
        pstmt.setString(20, joblist.getPublishTime());
        pstmt.setString(21, joblist.getCompanyName());
        pstmt.setInt(22, 0);
        pstmt.setString(23, "");
        pstmt.setString(24, "");
        pstmt.setString(25, "");
        pstmt.setInt(26, 0);
        pstmt.setString(27, "");
        pstmt.setString(28, "");
        pstmt.setInt(29, 0);
        pstmt.setInt(30, 0);
        pstmt.setInt(31, 0);
        pstmt.setString(32, "");
        pstmt.setString(33, "");
        pstmt.setInt(34, positionCatId);
        i = pstmt.executeUpdate();
        pstmt.close();
        conn.close();
        return i;
    }


    private static int insertDetail(Job joblist) throws SQLException {
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


