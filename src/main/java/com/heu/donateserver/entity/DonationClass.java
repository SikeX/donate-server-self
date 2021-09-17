package com.heu.donateserver.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("donation_class")
public class DonationClass {
    @TableId(value = "donation_Class_Id")
    private Long donationClassId;
    private String donationClassName;
    private Integer isAccess;
    private Integer priority;
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp lastEditTime;
}
