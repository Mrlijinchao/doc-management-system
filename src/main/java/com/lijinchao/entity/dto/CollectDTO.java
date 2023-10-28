package com.lijinchao.entity.dto;

import com.lijinchao.common.MessageConstant;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @ClassName CollectDTO
 * @Description 收藏的dto
 * @Author lijinchao
 * @Date 2022/6/19 5:22 下午
 * @Version 1.0
 **/
@Data
public class CollectDTO {

    @NotNull(message = MessageConstant.PARAMS_IS_NOT_NULL)
    private String docId;
}
