package com.heu.donateserver.service.impl;

import com.heu.donateserver.entity.Admin;
import com.heu.donateserver.mapper.AdminMapper;
import com.heu.donateserver.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sike
 * @since 2021-09-27
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
