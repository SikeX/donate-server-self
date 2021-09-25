package com.heu.donateserver.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.heu.donateserver.VO.DonationItemClassVO;
import com.heu.donateserver.VO.PageResponseVO;
import com.heu.donateserver.entity.DonationItem;
import com.baomidou.mybatisplus.extension.service.IService;
import com.heu.donateserver.util.PageParam;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sike
 * @since 2021-09-18
 */
public interface IDonationItemService extends IService<DonationItem> {

    PageResponseVO getDonationItemClass(PageParam param);
}
