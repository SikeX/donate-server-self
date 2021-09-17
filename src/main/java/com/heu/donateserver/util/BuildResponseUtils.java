package com.heu.donateserver.util;

import com.heu.donateserver.common.CommonResponse;
import com.heu.donateserver.common.ResponseCode;

public class BuildResponseUtils {

    // 构建正常的response
    public static CommonResponse<?> success() {
        CommonResponse<?> response = new CommonResponse<>();
        response.setStatus(ResponseCode.SUCCESS.status);
        response.setMsg(ResponseCode.SUCCESS.msg);
        return response;
    }

    // 构建异常的response
    public static CommonResponse<?> success(ResponseCode responseCode) {
        CommonResponse<?> response = new CommonResponse<>();
        response.setStatus(responseCode.status);
        response.setMsg(responseCode.SUCCESS.msg);
        return response;
    }

    /**
     * 构建系统异常的response(只用于系统异常)
     * @return CommonResponse 统一的返回结果
     */
    public static CommonResponse<?> error() {
        CommonResponse<?> response = new CommonResponse<>();
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
    public static <T> CommonResponse<T> buildResponse(T obj) {
        CommonResponse<T> response = new CommonResponse<>();
        response.setData(obj);
        response.setStatus(ResponseCode.SUCCESS.status);
        response.setMsg(ResponseCode.SUCCESS.msg);
        return response;
    }
}
