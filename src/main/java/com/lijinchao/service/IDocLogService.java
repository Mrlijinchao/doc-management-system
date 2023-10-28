package com.lijinchao.service;

import com.lijinchao.entity.FileDocument;
import com.lijinchao.entity.User;
import com.lijinchao.entity.dto.BasePageDTO;
import com.lijinchao.service.impl.DocLogServiceImpl;
import com.lijinchao.util.BaseApiResult;

import java.util.List;

/**
 * @ClassName IDocLogService
 * @Description 文档日志的信息
 * @Author lijinchao
 * @Date 2022/12/10 11:04
 * @Version 1.0
 **/
public interface IDocLogService {

    /**
     * add logs
     * @Author lijinchao
     * @Description add logs
     * @Date 22:54 2023/1/11
     * @Param [user, document, action]
     **/
    void addLog(User user, FileDocument document, DocLogServiceImpl.Action action);

    /**
     * query Doc Logs
     * @Author lijinchao
     * @Description 分页查询文档日志
     * @Date 20:57 2022/11/30
     * @Param page BasePageDTO
     * @Param user String
     * @return com.lijinchao.util.BaseApiResult
     **/
    BaseApiResult queryDocLogs(BasePageDTO page, String userId);

    /**
     * delete doc logs in batches
     * @Author lijinchao
     * @Description 批量删除文档的日志
     * @Date 20:57 2022/11/30
     * @Param ids 文档的id列表
     * @Param userId user index
     * @return com.lijinchao.util.BaseApiResult
     **/
    BaseApiResult deleteDocLogBatch(List<String> logIds, String userId);

}
