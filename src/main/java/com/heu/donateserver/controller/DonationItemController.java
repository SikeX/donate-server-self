package com.heu.donateserver.controller;


import com.heu.donateserver.VO.DonationItemClassVO;
import com.heu.donateserver.common.CommonResponse;
import com.heu.donateserver.entity.DonationItem;
import com.heu.donateserver.service.IDonationItemService;
import com.heu.donateserver.util.BuildResponseUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sike
 * @since 2021-09-18
 */
@Api(tags = "捐赠项目")
@RestController
public class DonationItemController {

    @Autowired
    private IDonationItemService iDonationItemService;

    /**
     * 新增捐赠项目
     * @param donationItem 实体
     * @return CommonResponse
     */
    @ApiOperation(value = "新增捐赠项目")
    @PostMapping("donationItem")
    public CommonResponse<?> add(@RequestBody DonationItem donationItem) {
        return BuildResponseUtils.buildResponse(iDonationItemService.save(donationItem));
    }

    @ApiOperation(value = "获取全部捐赠项目")
    @GetMapping("donationItems")
    @ResponseBody
    public CommonResponse<List<DonationItemClassVO>> getAll() {
        return BuildResponseUtils.buildResponse(iDonationItemService.getDonationItemClass());
    }

    /**
     * 通过id查询项目
     *
     * @param id 自增主键
     * @return CommonResponse
     */
    @ApiOperation(value = "通过id查询项目")
    @GetMapping("donationItem/{id}")
    public CommonResponse<DonationItem> getById(@PathVariable String id) {
        return BuildResponseUtils.buildResponse(iDonationItemService.getById(id));
    }

    /**
     * 更新项目信息
     *
     * @param donationItem 实体
     * @return CommonResponse
     */
    @ApiOperation("更新项目信息")
    @PutMapping("donationItem")
    public CommonResponse<?> update(@RequestBody DonationItem donationItem) {
        return BuildResponseUtils.buildResponse(iDonationItemService.updateById(donationItem));
    }

    /**
     * 通过id删除项目
     *
     * @param id 自增主键
     * @return CommonResponse
     */
    @ApiOperation("通过id删除项目")
    @DeleteMapping("donationItem/{id}")
    public CommonResponse<?> delete(@PathVariable String id) {
        return BuildResponseUtils.buildResponse(iDonationItemService.removeById(id));
    }

}

