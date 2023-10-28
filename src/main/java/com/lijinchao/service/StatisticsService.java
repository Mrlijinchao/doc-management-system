package com.lijinchao.service;

import com.lijinchao.util.BaseApiResult;


/**
 * @author jiarui.luo
 */
public interface StatisticsService {

    /**
     * trend
     * @return trend
     */
    BaseApiResult trend();

    /**
     * all
     * @return all
     */
    BaseApiResult all();

    /**
     * @Author lijinchao
     * @Description 统计各月的数据
     * @Date 17:10 2023/5/20
     * @Param []
     * @return com.lijinchao.util.BaseApiResult
     **/
    BaseApiResult getMonthStat();

}
