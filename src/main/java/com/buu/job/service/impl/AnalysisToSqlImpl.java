package com.buu.job.service.impl;

import com.buu.job.domain.KeyWordData;
import com.buu.job.service.AnalysisToSql;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.*;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Administrator on 2016/12/22.
 */
@Service
public class AnalysisToSqlImpl implements AnalysisToSql{
    public  void analysisToSql() {
        String path="/Users/xianshengrong/毕业设计/enjob";
        File file=new File(path);
        File[] files = file.listFiles();
        int id=0;
        for(File f:files){
            HashSet<KeyWordData> hashSet=new HashSet<KeyWordData>();
            try {
                String str=null;
                BufferedReader br=new BufferedReader(new FileReader(f));
                int lines=0;
                while ((str=br.readLine())!=null) {
                lines++;
                }
                br.close();
                BufferedReader br1=new BufferedReader(new FileReader(f));

                System.out.println(lines);
                    while ((str=br1.readLine())!=null){
                    String[] split = str.split("   ");
                        if(split[1].length()==1){
                            continue;
                        }
                        if(split[0].equalsIgnoreCase("null")){
                            continue;
                        }
                        if(lines>2000){
                            if(Integer.valueOf(split[1])<5){
                                continue;
                            }
                        }
                        if(lines<2000&&lines>1000){
                            if(Integer.valueOf(split[1])<3){
                                continue;
                            }
                        }
                        if(lines<1000){
                            if(Integer.valueOf(split[1])==1){
                                continue;
                            }
                        }
                        KeyWordData keyWordData = new KeyWordData();
                        keyWordData.keyword=split[0].toLowerCase();
                        keyWordData.count=split[1];
                        hashSet.add(keyWordData);
                }
                br.close();
                Connection conn = null;
                conn = getConn();
                PreparedStatement pstmt;
                String sqlSelectPositionCatId = "select id from job_cat where position_name = ?";
                pstmt = (PreparedStatement) conn.prepareStatement(sqlSelectPositionCatId);
                pstmt.setString(1, f.getName().toString().split(".tx")[0]);
                ResultSet set = pstmt.executeQuery();
                set.next();
                String positionCatId=set.getString(1);
                pstmt.close();
                set.close();
                String sqlInsertPositionKeyWord = "INSERT INTO  job_keyword VALUES (?,?,?,?)";
                Iterator<KeyWordData> iterator = hashSet.iterator();
                while(iterator.hasNext()){
                    id++;
                    KeyWordData s = iterator.next();
                    pstmt = (PreparedStatement) conn.prepareStatement(sqlInsertPositionKeyWord);
                    pstmt.setInt(1,id);
                    pstmt.setString(2,s.keyword);
                    pstmt.setString(3,s.count);
                    pstmt.setInt(4, Integer.valueOf(positionCatId));
                    pstmt.execute();
                    pstmt.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
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
