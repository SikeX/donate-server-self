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
 * @since 2021-09-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Admin对象", description = "")
public class Admin implements Serializable {


    @TableId(value = "admin_id", type = IdType.AUTO)
    private Integer adminId;

    private String name;

    private String passwd;

    private String salt;

    private String phone;

    private String email;

    private String department;

    @ApiModelProperty(value = "管理员分为4级，1为校级管理员，2为院级管理员，3为院二级管理人员，4为监察")
    private Integer role;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("last_login_time")
    private LocalDateTime lastLoginTime;

    @TableField("update_time")
    private LocalDateTime updateTime;

    public Admin(String name, String passwd) {
        this.name = name;
        this.passwd = passwd;
    }


}
