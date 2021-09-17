package com.heu.donateserver.service;

import com.heu.donateserver.common.CommonResponse;
import com.heu.donateserver.entity.DonationClass;

import java.util.List;

public interface DonationClassService {
    CommonResponse<List<DonationClass>> getDonationClassList();

    CommonResponse<DonationClass> getDonationClass(String donation_class_id);
}
