package com.heu.donateserver.service.impl;

import com.heu.donateserver.VO.DonationItemClassVO;
import com.heu.donateserver.entity.DonationItem;
import com.heu.donateserver.mapper.DonationItemMapper;
import com.heu.donateserver.service.IDonationItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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

    @Override
    public List<DonationItemClassVO> getDonationItemClass() {
        return this.donationItemMapper.getDonationItemClass();
    }
}
