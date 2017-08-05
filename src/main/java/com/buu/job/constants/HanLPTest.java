package com.buu.job.constants;

import com.hankcs.hanlp.seg.common.Term;
import com.hankcs.hanlp.tokenizer.NLPTokenizer;

import java.util.List;

/**
 * Created by xianshengrong on 2016/12/21.
 */
public class HanLPTest {
    public static void main(String[] args) {
        List<Term> termList = NLPTokenizer.segment("： 1)从事JAVA语言编程工作1-4年。 2)熟练使用Eclisps开发，有JSP、Servlet、JMS、Socket、Webservices相关编程经验； 3)熟悉大型数据库开发使用、熟悉MySQL数据库应用开发； 4)有微信相关开发经验者优先考虑。");
        for(int i=0;i<termList.size();i++){
            if(termList.get(i).nature.toString().contains("n")){
                System.out.println(termList.get(i).word);
            }
        }
    }
}
