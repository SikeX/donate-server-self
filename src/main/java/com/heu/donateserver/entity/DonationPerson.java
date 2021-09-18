package com.heu.donateserver.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
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
@ApiModel(value = "DonationPerson对象", description = "")
public class DonationPerson implements Serializable {


    @ApiModelProperty(value = "primary key")
    @TableId(value = "donation_person_id", type = IdType.AUTO)
    private Integer donationPersonId;

    @TableField("donation_person_name")
    private String donationPersonName;

    @TableField("donation_person_sex")
    private Integer donationPersonSex;

    @TableField("donation_person_phone")
    private String donationPersonPhone;

    @TableField("donation_pseron_email")
    private String donationPseronEmail;

    @TableField("donation_person_study_time")
    private String donationPersonStudyTime;

    @TableField("donation_person_student_no")
    private String donationPersonStudentNo;

    @TableField("donation_person_degree")
    private String donationPersonDegree;

    @TableField("is_schoolmate")
    private Integer isSchoolmate;

    @TableField("donation_person_job_site")
    private String donationPersonJobSite;

    @TableField("is_active")
    private Integer isActive;

    @TableField("donation_person_college")
    private String donationPersonCollege;

    @TableField("create_time")
    private LocalDateTime createTime;


}
