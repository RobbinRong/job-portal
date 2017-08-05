package com.buu.job.admin;

import com.google.gson.Gson;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.methods.GetMethod;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.*;
public class GetJson {
	/*
        * 获取列表数据
        * */
	public static void main(String[] args) {
		try {
			new  GetJson().getJson();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public  void getJson ()throws HttpException, IOException {
		HttpClient client;
		String[] joblist=new String[]{"Java","Python","PHP",".NET","C#","C++","C","VB","Delphi",
				"Perl","Ruby","Hadoop","Node.js","数据挖掘","自然语言处理","搜索算法","精准推荐","全栈工程师","Go",
				"ASP","Shell","后端开发其它","HTML5","Android","iOS","WP","移动开发其它","web前端","Flash",
				"html5","JavaScript","U3D","COCOS2D-X","前端开发其它","测试工程师","自动化测试","功能测试",
				"性能测试","测试开发","游戏测试","白盒测试","灰盒测试","黑盒测试","手机测试","硬件测试","测试经理","测试其它",
				"运维工程师","运维开发工程师","网络工程师","系统工程师","IT支持","IDC","CDN","F5","系统管理员","病毒分析",
				"WEB安全","网络安全","系统安全","运维经理","运维其它","MySQL","SQLServer","Oracle","DB2","MongoDB",
				"ETL","Hive","数据仓库","DBA其它","技术经理","技术总监","架构师","CTO","运维总监","技术合伙人","项目总监",
				"测试总监","安全专家","高端技术职位其它","项目经理","项目助理","硬件","嵌入式","自动化","单片机","电路设计",
				"驱动开发","系统集成","FPGA开发","DSP开发","ARM开发","PCB工艺","模具设计","热传导","材料工程师","精益工程师",
				"射频工程师","硬件开发其它","实施工程师","售前工程师","售后工程师","BI工程师","企业软件其它","产品经理",
				"网页产品经理","移动产品经理","产品助理","数据产品经理","电商产品经理","游戏策划","产品实习生","网页产品设计师",
				"无线产品设计师","产品部经理","产品总监","游戏制作人","网页设计师","Flash设计师","APP设计师","UI设计师",
				"平面设计师","美术设计师（2D/3）","广告设计师","多媒体设计师","原画师","游戏特效","游戏界面设计师","视觉设计师",
				"游戏场景","游戏角色","游戏动作","数据分析师","用户研究员","游戏数值策划","设计经理/主管","设计总监",
				"视觉设计经理/主管","视觉设计总监","交互设计经理/主管","交互设计总监","用户研究经理/主管","用户研究总监",
				"网页交互设计师","交互设计师","无线交互设计师","硬件交互设计师"};
		System.out.println(joblist.length);
		try {
		client = new HttpClient();
		// 访问一次，获取应有的cookie之类的。
//		GetMethod gm = new GetMethod(
//				"http://www.lagou.com/jobs/list_Java?px=default&city=%E5%85%A8%E5%9B%BD#filterBox");
//			client.executeMethod(gm);

		Gson gson=new Gson();
		int num=0;
		for(int j=0;j<joblist.length;j++){
			for(int i=1;i<=334;i++){
				log("index"+j+"JobList=="+joblist[j]+"=="+i+"页"+"num="+num);
				System.out.println("index"+j+"JobList=="+joblist[j]+"=="+i+"页"+"num="+num);
				String string =Utf8URLencode(joblist[j]);
				String url="http://www.lagou.com/jobs/positionAjax.json?px=default&first=false&pn="+i+"&kd="+string;
				System.out.println(url);
				GetMethod gm = new GetMethod(url);
//				GetMethod gm = new GetMethod(
//						"http://www.lagou.com/jobs/positionAjax.json?px=default&first=false&pn=1&kd=Java");
//commons-lang-2.1.jar
				client.executeMethod(gm);
				String content=gm.getResponseBodyAsString();
				//String content=getDataFromHttp("http://123.57.58.25/hotel/list?city=beijing&page=1&rows=10&orderby=rank&isdesc=0&keyword=null&type=4");
				System.out.println(content);
				Thread.sleep(4000);
				JobList fromJson = gson.fromJson(content, JobList.class);
				for(int k=0;k<fromJson.content.positionResult.result.size();k++){
					JobList.Result result = fromJson.content.positionResult.result.get(k);
					try{
						insert(result,fromJson.content.positionResult.queryAnalysisInfo.positionName);
						System.out.println("成功"+result);
						num++;
					}catch(SQLException e ){
						System.out.println("失败"+result);
						continue;
					}
				}
				if(null==fromJson.content.positionResult.result||fromJson.content.positionResult.result.isEmpty()){
					break;
				}
				}
	}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
		
		// 输出目录
		/*File file = new File("F:/lagou.txt");
		OutputStream os = new FileOutputStream(file);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		// 页面在相应网页右上角
		for (int i = 1; i <= 334; i++) {
			PostMethod pm = new PostMethod(
					"http://www.lagou.com/jobs/positionAjax.json?px=default");
			pm.addParameter("first", "false");
			pm.addParameter("pn", String.valueOf(i));
			//看一下ajax的参数
			pm.addParameter("kd", "Java");
			client.executeMethod(pm);
			osw.write(pm.getResponseBodyAsString());//获得返回的json
			System.out.println(i);
			osw.write("\n");
		}
		osw.flush();*/
	}
	public String getDataFromHttp(String u) throws Exception {
		URL url = new URL(u);
		HttpURLConnection urlcon = (HttpURLConnection)url.openConnection();
		urlcon.connect();         //获取连接
		InputStream is = urlcon.getInputStream();
		BufferedReader buffer = new BufferedReader(new InputStreamReader(is));
		StringBuffer bs = new StringBuffer();
		String l = null;
		while((l=buffer.readLine())!=null){
			bs.append(l).append("/n");
		}
		return  bs.toString();
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
	}/*
	
	private static boolean check(int positionId){
		Connection conn = getConn();
	    int i = 0;
	    String sql = "select COUNT(*) from joblist where positionId = ?";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) conn.prepareStatement(sql);
	        pstmt.setInt(1,positionId);
	        
	    }catch (Exception e) {
			// TODO: handle exception
		}
		
		return false;
		
	}*/
	private static int insert(JobList.Result joblist,String positionNameCat) throws  SQLException {
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
	        pstmt.setInt(1, joblist.positionId);
	        pstmt.setInt(2, joblist.companyId);
	        pstmt.setInt(3, joblist.score);
	        pstmt.setString(4, joblist.positionName);
	        pstmt.setString(5, joblist.createTime);
	        pstmt.setString(6, joblist.jobNature);
	        pstmt.setString(7, joblist.workYear);
	        pstmt.setString(8, joblist.education);
	        pstmt.setString(9, joblist.city);
	        pstmt.setString(10, "http://www.lagou.com/"+joblist.companyLogo);
	        pstmt.setString(11, joblist.positionAdvantage);
	        pstmt.setString(12, joblist.salary);
	        pstmt.setInt(13, joblist.approve);
	        pstmt.setString(14, joblist.industryField);
	        pstmt.setString(15, joblist.companyShortName);
	        pstmt.setString(16, joblist.financeStage);
	        pstmt.setString(17, joblist.companySize);
	        String labellist="";
	        if(null==joblist.companyLabelList){
		        pstmt.setString(18, labellist);
	        }
	        else{
	        	for(int n=0;n<joblist.companyLabelList.size();n++){
		        	labellist+=joblist.companyLabelList.get(n);
		        }	
		        pstmt.setString(18, labellist);
	        }
	        
	        pstmt.setString(19, joblist.district);
	        pstmt.setString(20, joblist.formatCreateTime);
	        pstmt.setString(21, joblist.companyFullName);
	        pstmt.setInt(22, joblist.adWord);
	        String companylabellist="";
			if(null==joblist.businessZones){
		        pstmt.setString(23, companylabellist);
	        }else{
	        	for(int n=0;n<joblist.businessZones.size();n++){
		        	labellist+=joblist.businessZones.get(n);
		        }
		        pstmt.setString(23, companylabellist);
	        }
	        pstmt.setString(24, joblist.imState);
	        pstmt.setString(25, String.valueOf(joblist.lastLogin));
	        pstmt.setInt(26, joblist.publisherId);
	        pstmt.setString(27, joblist.explain);
	        pstmt.setString(28, joblist.plus);
	        pstmt.setInt(29, joblist.pcShow);
	        pstmt.setInt(30, joblist.appShow);
	        pstmt.setInt(31, joblist.deliver);
	        pstmt.setString(32, joblist.gradeDescription);
	        pstmt.setString(33, joblist.promotionScoreExplain);
	        pstmt.setInt(34, positionCatId);
	        i = pstmt.executeUpdate();
	        pstmt.close();
	        conn.close();
	    return i;
	}


    public static String Utf8URLencode(String text) {
            StringBuffer result = new StringBuffer();
            for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 0 && c <= 255) {
            result.append(c);
            }else {
            byte[] b = new byte[0];
            try {
            b = Character.toString(c).getBytes("UTF-8");
            }catch (Exception ex) {
            }
            for (int j = 0; j < b.length; j++) {
            int k = b[j];
            if (k < 0) k += 256;
            result.append("%" + Integer.toHexString(k).toUpperCase());
            }
            }
            }
            return result.toString();
            }
}
