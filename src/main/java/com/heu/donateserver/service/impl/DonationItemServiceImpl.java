package com.heu.donateserver.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.heu.donateserver.VO.DonationItemClassVO;
import com.heu.donateserver.VO.PageResponseVO;
import com.heu.donateserver.entity.DonationItem;
import com.heu.donateserver.mapper.DonationItemMapper;
import com.heu.donateserver.service.IDonationItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heu.donateserver.util.PageParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sike
 * @since 2021-09-18
 */
@Service
public class DonationItemServiceImpl extends ServiceImpl<DonationItemMapper, DonationItem> implements IDonationItemService {

    @Autowired
    private DonationItemMapper donationItemMapper;

    @Autowired
    private IDonationItemService iDonationItemService;

    @Override
    public PageResponseVO getDonationItemClass(PageParam param) {

        PageResponseVO pageResponseVO = new PageResponseVO();

        Page<DonationItemClassVO> page = new Page<>(param.getCurrent(), param.getPageSize());
        page.setRecords(this.baseMapper.getDonationItemClass(page));
//        iDonationItemService .selectPage(page, null);
        pageResponseVO.setCurrent(param.getCurrent());
        pageResponseVO.setPageSize((param.getPageSize()));
        pageResponseVO.setTotal(page.getTotal());
        pageResponseVO.setSuccess(true);
        pageResponseVO.setData(page.getRecords());

        return pageResponseVO;
    }
}
