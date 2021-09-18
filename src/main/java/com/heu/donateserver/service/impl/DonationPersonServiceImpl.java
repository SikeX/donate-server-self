package com.heu.donateserver.service.impl;

import com.heu.donateserver.entity.DonationPerson;
import com.heu.donateserver.mapper.DonationPersonMapper;
import com.heu.donateserver.service.IDonationPersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sike
 * @since 2021-09-18
 */
@Service
public class DonationPersonServiceImpl extends ServiceImpl<DonationPersonMapper, DonationPerson> implements IDonationPersonService {

}
