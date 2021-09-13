package com.heu.donateserver.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class DonateClass {
    private Long donation_class_id;
    private String donation_class_name;
    private Integer is_access;
    private Integer priority;
    private Timestamp create_time;
    private Timestamp last_edit_time;
}
