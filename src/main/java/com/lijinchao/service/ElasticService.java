package com.lijinchao.service;

import com.lijinchao.entity.FileDocument;
import com.lijinchao.util.BaseApiResult;

import java.io.IOException;
import java.util.List;

/**
 * @author jiarui.luo
 */
public interface ElasticService {

    /**
     * search
     * @param keyword String
     * @return result
     * @throws IOException exception
     */
    List<FileDocument> search(String keyword) throws IOException;

    BaseApiResult getWordStat() throws IOException;

}
