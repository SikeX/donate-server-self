package com.heu.donateserver.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 
 * </p>
 *
 * @author sike
 * @since 2021-09-18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "DonationItem对象", description = "")
public class DonationItem implements Serializable {


    @JsonIgnore
    @ApiModelProperty(value = "primary key")
    @TableId(value = "donation_item_id", type = IdType.AUTO)
    private Integer donationItemId;

    @TableField("first_picture")
    private String firstPicture;

    @TableField("donation_item_name")
    private String donationItemName;

    @TableField("status")
    private Integer status;

    @TableField("raised_money")
    private String raisedMoney;

    @TableField("target_money")
    private String targetMoney;

    @TableField(exist = false)
    private Double progress;

    @TableField("is_show")
    private Integer isShow;

    @TableField("donation_item_detail")
    private String donationItemDetail;

    @TableField("donation_item_story")
    private String donationItemStory;

    @TableField("donation_item_specific_text")
    private String donationItemSpecificText;

    @ApiModelProperty(value = "create time")
    @TableField("create_time")
    private Timestamp createTime;

    @TableField("last_edit_time")
    private Timestamp lastEditTime;

    private Timestamp endtime;

    @JsonIgnore
    @TableField("donation_class_id")
    private Integer donationClassId;


    public Double getProgress() {

        Double progress =  Double.parseDouble(this.raisedMoney) / Double.parseDouble(this.targetMoney) * 100;

        BigDecimal result = new BigDecimal(progress);

        return result.setScale(0, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

}
