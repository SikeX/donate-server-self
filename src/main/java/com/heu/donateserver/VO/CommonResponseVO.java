package com.heu.donateserver.VO;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "commonResponse", description = "统一返回对象")
public class CommonResponseVO<T> implements Serializable {

    @ApiModelProperty(value = "状态码")
    private String status;

    @ApiModelProperty(value = "状态码对应信息")
    private String msg;

    @ApiModelProperty(value = "数据")
    private T data;

    @ApiModelProperty(value="是否成功")
    private Boolean success;
}
