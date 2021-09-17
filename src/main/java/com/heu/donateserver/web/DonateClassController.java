package com.heu.donateserver.web;

import com.heu.donateserver.common.CommonResponse;
import com.heu.donateserver.entity.DonationClass;
import com.heu.donateserver.service.DonationClassService;
import com.heu.donateserver.util.BuildResponseUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@Api(tags = "捐赠项目分类")
//@RequestMapping("/donateClasses/")  // 映射到/donateClasses下
public class DonateClassController {
    @Autowired
    private DonationClassService donationClassService;

    @ApiOperation("查询全部分类")
    @GetMapping("donateClasses")
    @ResponseBody
    public CommonResponse<List<DonationClass>> getDonationClassList(){
        return BuildResponseUtils.buildResponse(donationClassService.list());
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
