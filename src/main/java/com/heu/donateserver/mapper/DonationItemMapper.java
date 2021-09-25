package com.heu.donateserver.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.heu.donateserver.VO.DonationItemClassVO;
import com.heu.donateserver.entity.DonationItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author sike
 * @since 2021-09-18
 */
@Mapper
public interface DonationItemMapper extends BaseMapper<DonationItem> {

    @Select("SELECT donation_item.*, donation_class.donation_class_name FROM donation_class, donation_item WHERE donation_item.donation_class_id = donation_class.donation_class_id")
    List<DonationItemClassVO> getDonationItemClass(Page<DonationItemClassVO> page);
}
