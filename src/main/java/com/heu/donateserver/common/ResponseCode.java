package com.heu.donateserver.common;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//枚举
public enum ResponseCode {

    SUCCESS("0","SUCCESS"),
    ERROR("1","ERROR"),
    NEED_LOGIN("10","NEED_LOGIN"),
    ILLEGAL_ARGUMENT("2","ILLEGAL_ARGUMENT");

    public String status;
    public String msg;

    ResponseCode(String status,String msg){
        this.status = status;
        this.msg = msg;
    }
}