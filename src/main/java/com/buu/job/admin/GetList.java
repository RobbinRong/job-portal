package com.buu.job.admin;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.sql.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by xianshengrong on 2017/1/8.
 */
public class GetList {
    public void getList() {
        HashMap<String,String> jobs=new HashMap<String,String>();
        jobs.put("Java","Java");
        jobs.put("Python","Python");
        jobs.put("PHP","PHP");
        jobs.put(".NET",".NET");
        jobs.put("C%23","C#");
        jobs.put("C%2B%2B","C++");
        jobs.put("shujuwajue","数据挖掘");
        jobs.put("ziranyuyanchuli","自然语言处理");
        jobs.put("sousuosuanfa","搜索算法");
        jobs.put("jingzhuntuijian","精准推荐");
        jobs.put("quanzhangongchengshi","全栈工程师");
        jobs.put("C","C");
        jobs.put("VB","VB");
        jobs.put("Delphi","Delphi");
        jobs.put("Perl","Perl");
        jobs.put("Ruby","Ruby");
        jobs.put("Hadoop","Hadoop");
        jobs.put("Node.js","Node.js");

        jobs.put("go","Go");
        jobs.put("asp","ASP");
        jobs.put("shell","Shell");
        jobs.put("houduankaifaqita","后端开发其它");
        jobs.put("HTML5","HTML5");
        jobs.put("Android","Android");
        jobs.put("iOS","iOS");
        jobs.put("WP","WP");
        jobs.put("yidongkaifaqita","移动开发其它");
        jobs.put("webqianduan","web前端");
        jobs.put("Flash","Flash");
        jobs.put("html51","html5");
        jobs.put("JavaScript","JavaScript");
        jobs.put("U3D","U3D");
        jobs.put("COCOS2D-X","COCOS2D-X");
        jobs.put("qianduankaifaqita","前端开发其它");
        jobs.put("ceshigongchengshi","测试工程师");
        jobs.put("zidonghuaceshi","自动化测试");
        jobs.put("gongnengceshi","功能测试");
        jobs.put("xingnengceshi","性能测试");
        jobs.put("ceshikaifa","测试开发");
        jobs.put("youxiceshi","游戏测试");
        jobs.put("baiheceshi","白盒测试");
        jobs.put("huiheceshi","灰盒测试");
        jobs.put("heiheceshi","黑盒测试");
        jobs.put("shoujiceshi","手机测试");
        jobs.put("yingjianceshi","硬件测试");
        jobs.put("ceshijingli2","测试经理");
        jobs.put("ceshiqita","测试其它");
        jobs.put("yunweigongchengshi","运维工程师");
        jobs.put("yunweikaifagongchengshi","运维开发工程师");
        jobs.put("wangluogongchengshi","网络工程师");
        jobs.put("xitonggongchengshi","系统工程师");
        jobs.put("ITzhichi","IT支持");
        jobs.put("idc","IDC");
        jobs.put("cdn","CDN");
        jobs.put("f5","F5");
        jobs.put("xitongguanliyuan","系统管理员");
        jobs.put("bingdufenxi","病毒分析");
        jobs.put("webanquan","WEB安全");
        jobs.put("wangluoanquan","网络安全");
        jobs.put("xitonganquan","系统安全");
        jobs.put("yunweijingli","运维经理");
        jobs.put("yunweiqita","运维其它");
        jobs.put("MySQL","MySQL");
        jobs.put("SQLServer","SQLServer");
        jobs.put("Oracle","Oracle");
        jobs.put("DB2","DB2");
        jobs.put("MongoDB","MongoDB");
        jobs.put("etl","ETL");
        jobs.put("hive","Hive");
        jobs.put("shujucangku","数据仓库");
        jobs.put("dbaqita","DBA其它");
        jobs.put("jishujingli","技术经理");
        jobs.put("jishuzongjian","技术总监");
        jobs.put("jiagoushi","架构师");
        jobs.put("CTO","CTO");
        jobs.put("yunweizongjian","运维总监");
        jobs.put("jishuhehuoren","技术合伙人");
        jobs.put("xiangmuzongjian","项目总监");
        jobs.put("ceshizongjian","测试总监");
        jobs.put("anquanzhuanjia","安全专家");
        jobs.put("gaoduanjishuzhiweiqita","高端技术职位其它");
        jobs.put("xiangmujingli","项目经理");
        jobs.put("xiangmuzhuli","项目助理");
        jobs.put("yingjian","硬件");
        jobs.put("qianrushi","嵌入式");
        jobs.put("zidonghua","自动化");
        jobs.put("danpianji","单片机");
        jobs.put("dianlusheji","电路设计");
        jobs.put("qudongkaifa","驱动开发");
        jobs.put("xitongjicheng","系统集成");
        jobs.put("fpgakaifa","FPGA开发");
        jobs.put("dspkaifa","DSP开发");
        jobs.put("armkaifa","ARM开发");
        jobs.put("pcbgongyi","PCB工艺");
        jobs.put("mujusheji","模具设计");
        jobs.put("rechuandao","热传导");
        jobs.put("cailiaogongchengshi","材料工程师");
        jobs.put("jingyigongchengshi","精益工程师");
        jobs.put("shepingongchengshi","射频工程师");
        jobs.put("yingjiankaifaqita","硬件开发其它");
        jobs.put("shishigongchengshi","实施工程师");
        jobs.put("shouqiangongchengshi","售前工程师");
        jobs.put("shouhougongchengshi","售后工程师");
        jobs.put("bigongchengshi","BI工程师");
        jobs.put("qiyeruanjianqita","企业软件其它");
        jobs.put("chanpinjingli","产品经理");
        jobs.put("wangyechanpinjingli","网页产品经理");
        jobs.put("yidongchanpinjingli","移动产品经理");
        jobs.put("chanpinzhuli","产品助理");
        jobs.put("shujuchanpinjingli","数据产品经理");
        jobs.put("dianshangchanpinjingli","电商产品经理");
        jobs.put("youxicehua","游戏策划");
        jobs.put("chanpinshixisheng","产品实习生");
        jobs.put("wangyechanpinshejishi","网页产品设计师");
        jobs.put("wuxianchanpinshejishi","无线产品设计师");
        jobs.put("chanpinbujingli","产品部经理");
        jobs.put("chanpinzongjian","产品总监");
        jobs.put("youxizhizuoren","游戏制作人");
        jobs.put("wangyeshejishi","网页设计师");
        jobs.put("Flashshejishi","Flash设计师");
        jobs.put("APPshejishi","APP设计师");
        jobs.put("UIshejishi","UI设计师");
        jobs.put("pingmianshejishi","平面设计师");
        jobs.put("meishushejishi（2D3D）","美术设计师（2D/3）");
        jobs.put("guanggaoshejishi","广告设计师");
        jobs.put("duomeitishejishi","多媒体设计师");
        jobs.put("yuanhuashi","原画师");
        jobs.put("youxitexiao","游戏特效");
        jobs.put("youxijiemianshejishi","游戏界面设计师");
        jobs.put("shijueshejishi","视觉设计师");
        jobs.put("youxichangjing","游戏场景");
        jobs.put("youxijiaose","游戏角色");
        jobs.put("youxidongzuo","游戏动作");
        jobs.put("shujufenxishi","数据分析师");
        jobs.put("yonghuyanjiuyuan","用户研究员");
        jobs.put("youxishuzhicehua","游戏数值策划");
        jobs.put("shejijinglizhuguan","设计经理/主管");
        jobs.put("shejizongjian","设计总监");
        jobs.put("shijueshejijinglizhuguan","视觉设计经理/主管");
        jobs.put("shijueshejizongjian","视觉设计总监");
        jobs.put("jiaohushejijinglizhuguan","交互设计经理/主管");
        jobs.put("jiaohushejizongjian","交互设计总监");
        jobs.put("yonghuyanjiujinglizhuguan","用户研究经理/主管");
        jobs.put("yonghuyanjiuzongjian","用户研究总监");
        jobs.put("wangyejiaohushejishi","网页交互设计师");
        jobs.put("jiaohushejishi","交互设计师");
        jobs.put("wuxianjiaohushejishi","无线交互设计师");
        jobs.put("yingjianjiaohushejishi","硬件交互设计师");
//        String[] joblist=new String[]{"Java","Python","PHP",".NET","C%23","C%2B%2B","C","VB","Delphi",
//                "Perl","Ruby","Hadoop","Node.js","shujuwajue","ziranyuyanchuli","sousuosuanfa","jingzhuntuijian","quanzhangongchengshi","go",
//                "asp","shell","houduankaifaqita","HTML5","Android","iOS","WP","yidongkaifaqita","webqianduan","Flash",
//                "html51","JavaScript","U3D","COCOS2D-X","qianduankaifaqita","ceshigongchengshi","zidonghuaceshi","gongnengceshi",
//                "xingnengceshi","ceshikaifa","youxiceshi","baiheceshi","huiheceshi","heiheceshi","shoujiceshi","yingjianceshi","ceshijingli2","ceshiqita",
//                "yunweigongchengshi","yunweikaifagongchengshi","wangluogongchengshi","xitonggongchengshi","ITzhichi","idc","cdn","f5","xitongguanliyuan","bingdufenxi",
//                "webanquan","wangluoanquan","xitonganquan","yunweijingli","yunweiqita","MySQL","SQLServer","Oracle","DB2","MongoDB",
//                "etl","hive","shujucangku","dbaqita","jishujingli","jishuzongjian","jiagoushi","CTO","yunweizongjian","jishuhehuoren","xiangmuzongjian",
//                "ceshizongjian","anquanzhuanjia","gaoduanjishuzhiweiqita","xiangmujingli","xiangmuzhuli","yingjian","qianrushi","zidonghua","danpianji","dianlusheji",
//                "qudongkaifa","xitongjicheng","fpgakaifa","dspkaifa","armkaifa","pcbgongyi","mujusheji","rechuandao","cailiaogongchengshi","jingyigongchengshi",
//                "shepingongchengshi","yingjiankaifaqita","shishigongchengshi","shouqiangongchengshi","shouhougongchengshi","bigongchengshi","qiyeruanjianqita","chanpinjingli",
//                "wangyechanpinjingli","yidongchanpinjingli","chanpinzhuli","shujuchanpinjingli","dianshangchanpinjingli","youxicehua","chanpinshixisheng","wangyechanpinshejishi",
//                "wuxianchanpinshejishi","chanpinbujingli","chanpinzongjian","youxizhizuoren","wangyeshejishi","Flashshejishi","APPshejishi","UIshejishi",
//                "pingmianshejishi","meishushejishi（2D3D）","guanggaoshejishi","duomeitishejishi","yuanhuashi","youxitexiao","youxijiemianshejishi","shijueshejishi",
//                "youxichangjing","youxijuese","youxidongzuo","shujufenxishi","yonghuyanjiuyuan","youxishuzhicehua","shejijinglizhuguan","shejizongjian",
//                "shijueshejijinglizhuguan","shijueshejizongjian","jiaohushejijinglizhuguan","jiaohushejizongjian","yonghuyanjiujinglizhuguan","yonghuyanjiuzongjian",
//                "wangyejiaohushejishi","jiaohushejishi","wuxianjiaohushejishi","yingjianjiaohushejishi"};

        Set<Map.Entry<String, String>> entries = jobs.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            for (int j=1;j<=30;j++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String url = "https://www.lagou.com/zhaopin/"+next.getKey()+"/"+j+"/?filterOption=3";
                System.out.println(url);
                Document doc = JsoupConnector.getDocumentByUrl(url);
                if(doc==null){
                    continue;
                }
                Elements item_con_list = doc.select("[class=con_list_item default_list]");
                int size = item_con_list.size();
                GetDetail detail=new GetDetail();
                for (int i=0;i<size;i++){
                    Element root=item_con_list.get(i);
                    if(root==null){
                        continue;
                    }
                    String positionId = root.attr("data-positionid");
                    Job job = detail.getDetail(String.valueOf(positionId));
                    if(job==null){
                        continue;
                    }
                    String string = root.select("[class=li_b_l]").text();
                    String string1 = root.select("[class=industry]").text();
                    String district = root.select("[class=add]").text().replaceAll("\\[","").replaceAll("\\]","");
                    String[] split = string.split(" ");
                    String[] split1 = string1.split(" ");
                    String workYear=split[1];
                    String education=split[3];
                    String salary=split[0];
                    String positionCatName=next.getValue();
                    String field=split1[0];
                    String financestage="";
                    try {
                        financestage=split1[2];
                    }catch (ArrayIndexOutOfBoundsException e){
                        e.printStackTrace();
                        continue;
                    }
                    try {
                        insert(job, positionCatName, workYear, education, salary, field, financestage, district);
                    } catch (SQLException e) {
                        e.printStackTrace();
                        continue;
                    }
                }
            }

        }

        }




    private static int insert(Job joblist,String positionNameCat,String workYear,String education,String salary,String field,String financestage,String district) throws SQLException {
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
        pstmt.setString(7,workYear);
        pstmt.setString(8, education);
        pstmt.setString(9, joblist.getWorkPlace());
        pstmt.setString(10, joblist.getCompanyIconURL());
        pstmt.setString(11, joblist.getWelfare().replaceAll("职位诱惑 :",""));
        pstmt.setString(12, salary);
        pstmt.setInt(13, 1);
        pstmt.setString(14, field);
        pstmt.setString(15, joblist.getCompanyNickName().replaceAll("拉勾认证企业",""));
        pstmt.setString(16, financestage);
        pstmt.setString(17, joblist.getCompanyScale());
        pstmt.setString(18,  joblist.getWelfare().replaceAll("职位诱惑 :",""));
        pstmt.setString(19, district);
        pstmt.setString(20, joblist.getPublishTime());
        pstmt.setString(21, joblist.getCompanyName());
        pstmt.setInt(22, 0);
        pstmt.setString(23, "");
        pstmt.setString(24, "");
        pstmt.setString(25, "");
        pstmt.setInt(26, 0);
        pstmt.setString(27, "");
        pstmt.setString(28, "");
        pstmt.setInt(29,0);
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
