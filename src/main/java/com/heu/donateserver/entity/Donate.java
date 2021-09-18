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
@ApiModel(value = "Donate对象", description = "")
public class Donate implements Serializable {


    @ApiModelProperty(value = "primary key")
    @TableId(value = "donate_id", type = IdType.AUTO)
    private Integer donateId;

    @TableField("payment_id")
    private String paymentId;

    private Integer piece;

    @TableField("pay_method")
    private Integer payMethod;

    @TableField("is_success")
    private Integer isSuccess;

    @TableField("pay_time")
    private LocalDateTime payTime;

    private String message;

    @TableField("is_message_access")
    private Integer isMessageAccess;

    @TableField("is_message_show")
    private Integer isMessageShow;


}
