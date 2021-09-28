package com.heu.donateserver.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.heu.donateserver.VO.LoginResponseVO;
import com.heu.donateserver.common.ResponseCode;
import com.heu.donateserver.entity.Admin;
import com.heu.donateserver.service.IAdminService;
import com.heu.donateserver.util.MD5Utils;
import com.heu.donateserver.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sike
 * @since 2021-09-27
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private IAdminService iAdminService;

    @PostMapping("login")
    @ResponseBody
    public LoginResponseVO login(@RequestBody Admin user) {
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(user.getName() != null, "name",user.getName());
        Admin users = iAdminService.getOne(queryWrapper);

        // 密码校验
        String s = (MD5Utils.md5(user.getPasswd()+users.getSalt()));
        if (users.getPasswd().equals(s) == false){
            return new LoginResponseVO(ResponseCode.ERROR.status, "密码不正确");
        }
        queryWrapper.in(user.getPasswd() != null, "passwd", s);

        // 通过用户名从数据库中查询出该用户
        if (users == null ) {
            return new LoginResponseVO(ResponseCode.ERROR.status, "用户不存在");
        }
        String token = TokenUtil.sign(new Admin(user.getName(), s));
        HashMap<String, Object>  hs = new HashMap<>();
        hs.put("token", token);
        hs.put("adminId", user.getAdminId());
        return new LoginResponseVO(String.valueOf(HttpStatus.OK.value()),"成功");
    }
    @PostMapping("addUser")
    @ResponseBody
    public LoginResponseVO addUser(@RequestBody Admin user) {
        try {
            QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("name",user.getName());
            Admin users = iAdminService.getOne(queryWrapper);
            if (users != null){
                return LoginResponseVO.THE_USER_ALREADY_EXISTS;
            }
            // 设置盐
            String salt = "test";
            user.setSalt(salt);
            String s = MD5Utils.md5(user.getPasswd()+salt);
            user.setPasswd(s);
            iAdminService.save(user);
            return new LoginResponseVO(ResponseCode.SUCCESS.status, "添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new LoginResponseVO(ResponseCode.ERROR.status, "添加失败");
        }
    }
}

