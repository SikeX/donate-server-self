package com.heu.donateserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heu.donateserver.entity.DonationClass;
import com.heu.donateserver.mapper.DonationClassMapper;
import com.heu.donateserver.service.DonationClassService;
import org.springframework.stereotype.Service;

@Service
public class DonationClassServiceImpl extends ServiceImpl<DonationClassMapper, DonationClass> implements DonationClassService {
//    @Autowired
//    DonationClassMapper donationClassMapper;
//
//    @Override
//    public CommonResponse<List<DonationClass>> getDonationClassList() {
//        List<DonationClass> donationClassList = donationClassMapper.selectList(null);
//        if(donationClassList.isEmpty()) {
//            return CommonResponse.createForSuccessMessage("没有信息");
//        }
//        return CommonResponse.createForSuccess(donationClassList);
//    }
//
//    @Override
//    public CommonResponse<DonationClass> getDonationClass(String donation_class_id) {
//        DonationClass donationClass = donationClassMapper.selectById(donation_class_id);
//        if(donationClass == null){
//            return CommonResponse.createForSuccessMessage("没有该ID的DonationClass");
//        }
//        return CommonResponse.createForSuccess(donationClass);
//    }

}
