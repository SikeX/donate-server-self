package com.heu.donateserver.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class DonationItem {
    private Integer donation_item_id;
    private byte[] first_picture;
    private String donation_item_name;
    private String target_money;
    private Integer is_show;
    private String donation_item_detail;
    private String donation_item_story;
    private String donation_item_specific_text;
    private Timestamp create_time;
    private Timestamp last_edit_time;
    private Timestamp end_time;
    private Long donation_project_class_id;


}
