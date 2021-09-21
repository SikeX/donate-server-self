package com.heu.donateserver.VO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.heu.donateserver.entity.DonationClass;
import com.heu.donateserver.entity.DonationItem;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class DonationItemClassVO extends DonationItem implements Serializable {

    @TableField("donation_class_name")
    private String donationClassName;
}
