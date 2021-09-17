package com.heu.donateserver.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "commonResponse", description = "统一返回对象")
public class CommonResponse<T> implements Serializable {

    @ApiModelProperty(value = "状态码")
    private String status;

    @ApiModelProperty(value = "状态码对应信息")
    private String msg;

    @ApiModelProperty(value = "数据")
    private T data;

//    private CommonResponse(String status) {
//        this.status = status;
//    }
//
//    private CommonResponse(int status, String msg) {
//        this.status = status;
//        this.msg = msg;
//    }
//
//    private CommonResponse(String status, T data) {
//        this.status = status;
//        this.data = data;
//    }
//
//    private CommonResponse(String status, String msg, T data) {
//        this.status = status;
//        this.msg = msg;
//        this.data = data;
//    }
//
//    @JsonIgnore
//    public boolean isSuccess() {
//        return this.status == ResponseCode.SUCCESS.getCode();
//    }
//
//    public static <T> CommonResponse<T> createForSuccess() {
//        return new CommonResponse<T>(ResponseCode.SUCCESS.getCode());
//    }
//
//    public static <T> CommonResponse<T> createForSuccess(T data) {
//        return new CommonResponse<T>(ResponseCode.SUCCESS.getCode(), data);
//    }
//
//    public static <T> CommonResponse<T> createForSuccessMessage(String msg) {
//        return new CommonResponse<T>(ResponseCode.SUCCESS.getCode(), msg);
//    }
//
//    public static <T> CommonResponse<T> createForSuccess(String msg, T data) {
//        return new CommonResponse<T>(ResponseCode.SUCCESS.getCode(), msg, data);
//    }
//    public static <T> CommonResponse<T> createForError(String msg){
//        return new CommonResponse<T>(ResponseCode.ERROR.getCode(),msg);
//    }
//    public static <T> CommonResponse<T> createForError(int code,String msg){
//        return new CommonResponse<T>(code,msg);
//    }
}
