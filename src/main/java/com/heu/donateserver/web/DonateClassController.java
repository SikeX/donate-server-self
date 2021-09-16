package com.heu.donateserver.web;

import com.heu.donateserver.entity.DonationClass;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@RequestMapping(value="/donateClasses")  // 映射到/donateClasses下
public class DonateClassController {

    @GetMapping("/")
    public String index() {
        return "hello,world";
    }

    // 创建线程安全的Map，模拟users信息的存储
//    static Map<Long, DonationClass> donateClasses = Collections.synchronizedMap(new HashMap<Long, DonationClass>());

//    @GetMapping("/")
//    public List<DonationClass> getDonateClassList() {
//        List<DonationClass> r = new ArrayList<DonationClass>(donateClasses.values());
//        return r;
//    }
//
//    @PostMapping("/")
//    public String postDonateClass(@RequestBody DonationClass donationClass) {
//        donateClasses.put(donationClass.getDonation_class_id(), donationClass);
//        return "success";
//    }

}
