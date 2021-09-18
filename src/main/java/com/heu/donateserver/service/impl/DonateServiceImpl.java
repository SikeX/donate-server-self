package com.heu.donateserver.service.impl;

import com.heu.donateserver.entity.Donate;
import com.heu.donateserver.mapper.DonateMapper;
import com.heu.donateserver.service.IDonateService;
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
public class DonateServiceImpl extends ServiceImpl<DonateMapper, Donate> implements IDonateService {

}
