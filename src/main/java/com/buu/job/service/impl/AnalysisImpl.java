package com.buu.job.service.impl;

import com.buu.job.domain.AnalysisData;
import com.buu.job.service.Analysis;
import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.dictionary.CustomDictionary;
import com.hankcs.hanlp.seg.Segment;
import com.hankcs.hanlp.seg.common.Term;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.*;
import java.util.*;

/**
 * Created by Administrator on 2016/12/15.
 */
@Service
public class AnalysisImpl implements Analysis{

    public  void analysis() {
        Segment segment = HanLP.newSegment().enableCustomDictionary(true);
        CustomDictionary.add("sql server");
        CustomDictionary.add("android studio");
        CustomDictionary.add("visual studio");
        CustomDictionary.add("android sdk");
        CustomDictionary.add("android ndk");
        CustomDictionary.add("android ui");
        CustomDictionary.add("tcp/ip");
        CustomDictionary.add("rtp/rtcp");
        CustomDictionary.add("spring mvc");
        CustomDictionary.add("intellij idea");
        CustomDictionary.add("one hot");
        CustomDictionary.add("code review");
        CustomDictionary.add("material design");
        CustomDictionary.add("react native");
        CustomDictionary.add("stack overflow");
        CustomDictionary.add("objective-c");
        CustomDictionary.add("objective c");
        CustomDictionary.add("easy-ui");
        CustomDictionary.add("java script");
        for (int i = 21; i <= 168; i++) {
            Connection conn = null;
            ArrayList<String> ids = new ArrayList<String>();
            try {
                conn = getConn();
                PreparedStatement pstmt;
                String sqlSelectPositionids = "select positionid from job_list where positioncatid = ?";
                String sqlSelectPositionName = "select position_name from job_cat where id = ?";
                String sqlSelectPostRequest = "SELECT postRequest FROM job_detail WHERE positionId= ?";
                pstmt = (PreparedStatement) conn.prepareStatement(sqlSelectPositionName);
                pstmt.setString(1, String.valueOf(i));
                ResultSet set = pstmt.executeQuery();
                set.next();
                String fileName=set.getString(1);
                pstmt.close();
                set.close();

                pstmt = (PreparedStatement) conn.prepareStatement(sqlSelectPositionids);
                pstmt.setString(1, String.valueOf(i));
                set = pstmt.executeQuery();
                while (set.next()) {
                    ids.add(set.getString(1));
                }
                pstmt.close();
                set.close();
                StringBuilder postRequest = new StringBuilder();
                for (int j = 0; j < ids.size(); j++) {
                    pstmt = conn.prepareStatement(sqlSelectPostRequest);
                    pstmt.setString(1, String.valueOf(ids.get(j)));
                    set = pstmt.executeQuery();
                    boolean isempty = set.next();
                    if (isempty == false) {
                        continue;
                    } else {
                        postRequest.append(set.getString(1));
                    }
                }
                List<Term> termList = segment.seg(postRequest.toString().toLowerCase());
                AnalysisData data = new AnalysisData();
                data.positionCatId = 21;
                int size=termList.size();
                for (int k = 0; k < size; k++) {
                    Term term = termList.get(k);
                    if(term.nature.toString().contains("n")){
                        String key =term.word;
                        boolean matches = key.matches("^[a-zA-Z]*");
                        if(matches){
                            if (data.enHashMap.containsKey(key)) {
                                Integer integer = data.enHashMap.get(key);
                                integer++;
                                data.enHashMap.put(key, integer);
                            } else {
                                data.enHashMap.put(key, 1);
                            }
                        }
                        else{
                            if (data.hashMap.containsKey(key)) {
                                Integer integer = data.hashMap.get(key);
                                integer++;
                                data.hashMap.put(key, integer);
                            } else {
                                data.hashMap.put(key, 1);
                            }
                        }

                    }
                    else{
                        String key =term.word;
                        if (data.noHashMap.containsKey(key)) {
                            Integer integer = data.noHashMap.get(key);
                            integer++;
                            data.noHashMap.put(key, integer);
                        } else {
                            data.noHashMap.put(key, 1);
                        }
                    }

                }

                List<Map.Entry<String, Integer>> infoIds =
                        new ArrayList<Map.Entry<String, Integer>>(data.hashMap.entrySet());
                Collections.sort(infoIds, new Comparator<Map.Entry<String, Integer>>() {
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        return (o2.getValue() - o1.getValue());
                    }
                });
                List<Map.Entry<String, Integer>> eninfoIds =
                        new ArrayList<Map.Entry<String, Integer>>(data.enHashMap.entrySet());
                Collections.sort(eninfoIds, new Comparator<Map.Entry<String, Integer>>() {
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        return (o2.getValue() - o1.getValue());
                    }
                });
                List<Map.Entry<String, Integer>> noinfoIds =
                        new ArrayList<Map.Entry<String, Integer>>(data.noHashMap.entrySet());
                Collections.sort(noinfoIds, new Comparator<Map.Entry<String, Integer>>() {
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        return (o2.getValue() - o1.getValue());
                    }
                });
                int infoidssize=infoIds.size();
                File file=new File("/Users/xianshengrong/毕业设计/job/"+fileName+".txt");
                BufferedWriter bw=new BufferedWriter(new FileWriter(file));
                for(int n=0;n<infoidssize;n++){
                    bw.write(infoIds.get(n).getKey()+"   "+infoIds.get(n).getValue());
                    bw.newLine();
                    System.out.println(infoIds.get(n).getKey()+"   "+infoIds.get(n).getValue());
                }
                bw.close();

                int eninfoidssize=eninfoIds.size();
                File enfile=new File("/Users/xianshengrong/毕业设计/enjob/"+fileName+".txt");
                BufferedWriter enbw=new BufferedWriter(new FileWriter(enfile));
                for(int n=0;n<eninfoidssize;n++){
                    enbw.write(eninfoIds.get(n).getKey()+"   "+eninfoIds.get(n).getValue());
                    enbw.newLine();
                    System.out.println(eninfoIds.get(n).getKey()+"   "+eninfoIds.get(n).getValue());
                }
                enbw.close();

                int noinfoidssize=noinfoIds.size();
                File nofile=new File("/Users/xianshengrong/毕业设计/nojob/"+fileName+".txt");
                BufferedWriter nobw=new BufferedWriter(new FileWriter(nofile));
                for(int n=0;n<noinfoidssize;n++){
                    nobw.write(noinfoIds.get(n).getKey()+"   "+noinfoIds.get(n).getValue());
                    nobw.newLine();
                    System.out.println(noinfoIds.get(n).getKey()+"   "+noinfoIds.get(n).getValue());
                }
                nobw.close();


//                Iterator iter = data.hashMap.entrySet().iterator();
//                while (iter.hasNext()) {
//                    Map.Entry entry = (Map.Entry) iter.next();
//                    System.out.println(data.positionCatId+"==="+entry.getKey()+"==="+entry.getValue());
//                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
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
    }

}
