package com.buu.job.service.impl;

import com.buu.job.domain.JobDetail;
import com.buu.job.domain.JobDetailExample;
import com.buu.job.mapper.JobDetailMapper;
import com.buu.job.service.IndexService;
import jeasy.analysis.MMAnalyzer;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.queryParser.MultiFieldQueryParser;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by xianshengrong on 2016/12/9.
 */
@Service
public class IndexServiceImpl implements IndexService {
    Analyzer zh2 = new MMAnalyzer();
    @Value("${INDEX_PATH}")
    public String INDEX_PATH;
    @Autowired
    JobDetailMapper jobDetailMapper;

    public void createIndex() throws Exception {
        IndexWriter indexWriter = new IndexWriter(INDEX_PATH, zh2, true,
                IndexWriter.MaxFieldLength.LIMITED);
        JobDetailExample example=new JobDetailExample();
        List<JobDetail> jobDetails = jobDetailMapper.selectByExample(example);
        for(JobDetail jobDetail:jobDetails){
            Document document = getDocument(jobDetail);
            indexWriter.addDocument(document);
        }
        indexWriter.close();
    }

    public void deleteIndex() {
        File file=new File(INDEX_PATH);
        System.out.println(file.getAbsolutePath());
        File[] files = file.listFiles();
        for (File f:files){
            f.delete();
        }
    }

    public List<Integer> search(String keyword) throws Exception {
        List<Integer> positionids=new ArrayList<Integer>();
        String[] fields = { "positionname", "companyname","duty","postrequest" };
        QueryParser queryParser = new MultiFieldQueryParser(fields, zh2);
        Query query = queryParser.parse(keyword);
        IndexSearcher indexSearcher = new IndexSearcher(INDEX_PATH);
        Filter filter = null;
        TopDocs topDocs = indexSearcher.search(query, filter, 10000);
        System.out.println("共查询到" + topDocs.totalHits + "条结果");

        for (ScoreDoc scoreDoc : topDocs.scoreDocs) {
            int docSn = scoreDoc.doc;
            Document doc = indexSearcher.doc(docSn);
            positionids.add(Integer.valueOf(doc.get("positionid")));
        }
        if(positionids.isEmpty()){
            return Collections.EMPTY_LIST;
        }
        else {
            return positionids;
        }
    }

    private Document getDocument(JobDetail jobDetail) {
        Document doc = new Document();
        String duty = jobDetail.getDuty();
        String postrequest = jobDetail.getPostrequest();
        if(duty==null){
            duty="null";
        }
        if(postrequest==null){
            postrequest="null";
        }
        doc.add(new Field("positionid", String.valueOf(jobDetail.getPositionid()), Field.Store.YES, Field.Index.ANALYZED));
        doc.add(new Field("positionname", jobDetail.getPost(), Field.Store.YES, Field.Index.ANALYZED));
        doc.add(new Field("companyname", jobDetail.getCompanyname(), Field.Store.YES, Field.Index.ANALYZED));
        doc.add(new Field("duty", duty, Field.Store.YES, Field.Index.ANALYZED));
        doc.add(new Field("postrequest",postrequest , Field.Store.YES, Field.Index.ANALYZED));
        return doc;
    }

}
