package com.buu.job.service;

import java.util.List;

/**
 * Created by xianshengrong on 2016/12/9.
 */
public interface IndexService {
    void createIndex()throws Exception;

    void deleteIndex()throws Exception;
    List<Integer> search(String keyword)throws  Exception;
}
