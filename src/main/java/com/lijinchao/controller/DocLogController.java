package com.lijinchao.controller;

import com.lijinchao.auth.Permission;
import com.lijinchao.auth.PermissionEnum;
import com.lijinchao.common.MessageConstant;
import com.lijinchao.entity.dto.BasePageDTO;
import com.lijinchao.entity.dto.BatchIdDTO;
import com.lijinchao.service.IDocLogService;
import com.lijinchao.util.BaseApiResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

/**
 * @ClassName DocLogController
 * @Description 文档日志的查询等
 * @Author lijinchao
 * @Date 2022/12/10 11:10
 * @Version 1.0
 **/
@Api(tags = "文档日志模块")
@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/docLog")
public class DocLogController {

    @Resource
    private IDocLogService docLogService;

    /**
     * @return com.lijinchao.util.BaseApiResult
     * @Author lijinchao
     * @Description 系统用户日志查询
     * @Date 21:16 2022/11/30
     * @Param [pageParams]
     **/
    @Permission({PermissionEnum.ADMIN})
    @ApiOperation(value = "管理员查询系统日志信息", notes = "只有管理员有权限查询日志列表")
    @GetMapping("queryLogList")
    public BaseApiResult queryLogList(@ModelAttribute("pageParams") @Valid BasePageDTO pageParams, HttpServletRequest request) {
        return docLogService.queryDocLogs(pageParams, (String) request.getAttribute("id"));
    }

    /**
     * @return com.lijinchao.util.BaseApiResult
     * @Author lijinchao
     * @Description 删除用户日志
     * @Date 21:16 2022/11/30
     * @Param [logIds]
     **/
    @Permission(PermissionEnum.ADMIN)
    @ApiOperation(value = "管理员删除文档信息", notes = "只有管理员有权限删除文档的日志")
    @DeleteMapping("removeLog")
    public BaseApiResult removeLog(@RequestBody @Valid BatchIdDTO batchIdDTO, HttpServletRequest request) {
        List<String> logIds = batchIdDTO.getIds();
        if (CollectionUtils.isEmpty(logIds)) {
            return BaseApiResult.error(MessageConstant.PARAMS_ERROR_CODE, MessageConstant.PARAMS_IS_NOT_NULL);
        }
        return docLogService.deleteDocLogBatch(logIds,(String) request.getAttribute("id"));
    }

}
