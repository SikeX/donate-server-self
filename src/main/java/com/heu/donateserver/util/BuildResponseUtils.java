package com.heu.donateserver.util;

import com.heu.donateserver.VO.CommonResponseVO;
import com.heu.donateserver.common.ResponseCode;

public class BuildResponseUtils {

    // 构建正常的response
    public static CommonResponseVO<?> success() {
        CommonResponseVO<?> response = new CommonResponseVO<>();
        response.setStatus(ResponseCode.SUCCESS.status);
        response.setMsg(ResponseCode.SUCCESS.msg);
        response.setSuccess(true);
        return response;
    }

    // 构建异常的response
    public static CommonResponseVO<?> success(ResponseCode responseCode) {
        CommonResponseVO<?> response = new CommonResponseVO<>();
        response.setStatus(responseCode.status);
        response.setMsg(responseCode.SUCCESS.msg);
        response.setSuccess(false);
        return response;
    }

    /**
     * 构建系统异常的response(只用于系统异常)
     * @return CommonResponse 统一的返回结果
     */
    public static CommonResponseVO<?> error() {
        CommonResponseVO<?> response = new CommonResponseVO<>();
        response.setStatus(ResponseCode.ERROR.status);
        response.setMsg(ResponseCode.ERROR.msg);
        return response;
    }

    /**
     * 构建返回结果
     * @param obj 结果数据
     * @param <T> 结果数据的泛型
     * @return CommonResponse 统一的返回结果
     */
    public static <T> CommonResponseVO<T> buildResponse(T obj) {
        CommonResponseVO<T> response = new CommonResponseVO<>();
        response.setData(obj);
        response.setStatus(ResponseCode.SUCCESS.status);
        response.setMsg(ResponseCode.SUCCESS.msg);
        response.setSuccess(true);
        return response;
    }
}
