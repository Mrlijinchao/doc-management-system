package com.lijinchao.service;


import com.lijinchao.entity.dto.BasePageDTO;
import com.lijinchao.util.BaseApiResult;

import java.util.List;

public interface DocReviewService {


    /**
     * @Author lijinchao
     * @Description 用户修改为已读状态
     * @Date 20:47 2022/11/30
     * @Param [reviewId]
     * @return com.lijinchao.util.BaseApiResult
     **/
    BaseApiResult userRead(List<String> ids, String userId);

    /**
     * @Author lijinchao
     * @Description 拒绝文档
     * @Date 20:54 2022/11/30
     * @Param [docId, reason] 文档的id 和 拒绝的原因
     * @return com.lijinchao.util.BaseApiResult
     **/
    BaseApiResult refuse(String docId, String reason);

    /**
     * @Author lijinchao
     * @Description 批量拒绝文档
     * @Date 20:54 2022/11/30
     * @Param [docId] 文档列表的id
     * @return com.lijinchao.util.BaseApiResult
     **/
    BaseApiResult refuseBatch(List<String> docIds, String reason);

    /**
     * @Author lijinchao
     * @Description 管理员同意一批文档
     * @Date 22:04 2022/12/9
     * @Param [docIds]
     * @return com.lijinchao.util.BaseApiResult
     **/
    BaseApiResult approveBatch(List<String> docIds);


    /**
     * @Author lijinchao
     * @Description 管理员或者普通用户删除评审
     * @Date 20:53 2022/11/30
     * @Param []
     * @return com.lijinchao.util.BaseApiResult
     **/
    BaseApiResult deleteReviewsBatch(List<String> docIds, String userId);

    /**
     * @Author lijinchao
     * @Description 查询评审的日志
     * 区分管理员和普通用户
     * @Date 20:57 2022/11/30
     * @Param [page, user]
     * @return com.lijinchao.util.BaseApiResult
     **/
    BaseApiResult queryReviewLog(BasePageDTO page, String userId, Boolean isAdmin);

    void removeReviews(List<String> docIds);
}
