package com.heu.donateserver.VO;

import com.heu.donateserver.common.ResponseCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponseVO {
    private String resCode;
    private String resMsg;

    public static final LoginResponseVO LOGIN_SUCCESS = new LoginResponseVO(ResponseCode.SUCCESS.status, ResponseCode.SUCCESS.msg);
    public static final LoginResponseVO LOGIN_FAIL_PASS = new LoginResponseVO(ResponseCode.ERROR.status, "用户名或密码错误");
    public static final LoginResponseVO THE_USER_ALREADY_EXISTS = new LoginResponseVO(ResponseCode.ERROR.status, "该用户已存在");
}
