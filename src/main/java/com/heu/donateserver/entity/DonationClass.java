package com.heu.donateserver.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("donation_class")
public class DonationClass {
    @TableId(value = "donation_Class_Id")
    private Long donation_class_id;
    private String donation_class_name;
    private Integer is_access;
    private Integer priority;
    private Timestamp create_time;
    private Timestamp last_edit_time;
}
