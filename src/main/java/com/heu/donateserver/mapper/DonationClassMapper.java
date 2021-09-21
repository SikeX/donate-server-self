package com.heu.donateserver.mapper;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heu.donateserver.entity.DonationClass;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DonationClassMapper extends BaseMapper<DonationClass> {
    
    
}
