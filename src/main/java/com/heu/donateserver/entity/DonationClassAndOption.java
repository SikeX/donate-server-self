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
@ApiModel(value = "DonationClassAndOption对象", description = "")
public class DonationClassAndOption implements Serializable {


    @ApiModelProperty(value = "primary key")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("donation_class_id")
    private Integer donationClassId;

    @TableField("donation_option_id")
    private Integer donationOptionId;

    private String price;


}
