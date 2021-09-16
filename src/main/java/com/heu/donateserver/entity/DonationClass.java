package com.heu.donateserver.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("donation-class")
public class DonationClass {
    private Long donation_class_id;
    private String donation_class_name;
    private Integer is_access;
    private Integer priority;
    private Timestamp create_time;
    private Timestamp last_edit_time;
}
