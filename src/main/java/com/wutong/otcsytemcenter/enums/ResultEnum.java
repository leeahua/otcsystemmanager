package com.wutong.otcsytemcenter.enums;

public enum ResultEnum {

    SUCCESS("0","操作成功"),
    FAILED("1","操作失败");

    private String code;
    private String msg;
    ResultEnum(String code,String msg){
        this.code = code;
        this.msg = msg;
    }
}
