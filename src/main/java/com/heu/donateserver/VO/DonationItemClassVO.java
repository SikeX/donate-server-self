package com.heu.donateserver.VO;

import com.baomidou.mybatisplus.annotation.TableField;
import com.heu.donateserver.entity.DonationItem;
import lombok.Data;

import java.io.Serializable;

@Data
public class DonationItemClassVO extends DonationItem implements Serializable {

    @TableField("donation_class_name")
    private String donationClassName;
}
