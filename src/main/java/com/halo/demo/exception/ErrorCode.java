package com.halo.demo.exception;


import lombok.Getter;

/**
 * 错误码
 * @author
 */
public enum ErrorCode {
    SUCCESS("00000", "成功"),
    REMOTE_CALL_ERROR("30000", "远程调用异常"),
    PARAMETER_ERROR("40000", "参数错误"),
    BUSINESS_ERROR("50000", "业务异常"),
    BUSINESS_API_CLOSED("99997", "接口已下线"),
    REQUEST_LIMIT("99998", "网关限流"),
    FAILURE("99999", "系统异常");

    @Getter
    private String code;
    @Getter
    private String desc;

    public static final char REMOTE_CALL_ERROR_CODE_PREFIX = '3';
    public static final char PARAMETER_ERROR_PREFIX = '4';
    public static final char BUSINESS_ERROR_PREFIX = '5';
    public static final char SYSTEM_ERROR_CODE_PREFIX = '9';


    ErrorCode(String code, String desc){
        this.code = code;
        this.desc = desc;
    }
}
