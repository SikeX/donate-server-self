package com.heu.donateserver.VO;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class PageResponseVO<T> implements Serializable {

    @ApiModelProperty("数据")
    private T data;

    @ApiModelProperty("目前页数")
    private Integer current;

    @ApiModelProperty("一页包含的项目数")
    private Integer pageSize;

    @ApiModelProperty("是否成功")
    private Boolean success = false;

    @ApiModelProperty("总共项目数")
    private Long total;
}
