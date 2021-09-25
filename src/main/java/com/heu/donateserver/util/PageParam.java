package com.heu.donateserver.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 统一的查询请求参数
 */
@Data
@ApiModel(value = "PageParam",description = "分页参数")
public class PageParam {

    @ApiModelProperty(value = "当前页码,不传则为1")
    private Integer current = 1;

    @ApiModelProperty(value = "每页条数,不传默认为5")
    private Integer pageSize = 5;

}
