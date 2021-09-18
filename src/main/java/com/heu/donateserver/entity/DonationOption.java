package com.heu.donateserver.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author sike
 * @since 2021-09-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "DonationOption对象", description = "")
public class DonationOption implements Serializable {


    @ApiModelProperty(value = "primary key")
    @TableId(value = "donation_option_id", type = IdType.AUTO)
    private Integer donationOptionId;

    @TableField("donation_option_name")
    private String donationOptionName;


}
