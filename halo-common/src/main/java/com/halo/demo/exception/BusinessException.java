package com.halo.demo.exception;

/**
 * 业务异常
 * @author zhy
 */
public class BusinessException extends BaseException {

    public BusinessException(ErrorCode errorCode, String message) {
        super(errorCode, message);
    }

    public BusinessException(String code, String message, Throwable cause) {
        super(code, message, cause);
    }

    public BusinessException(ErrorCode errorCode, String message, Throwable cause) {
        this(errorCode.getCode(), message, cause);
    }

    public BusinessException(ErrorCode errorCode, Throwable cause) {
        this(errorCode.getCode(), errorCode.getDesc(), cause);
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode);
    }

    public BusinessException(String message) {
        this(ErrorCode.BUSINESS_ERROR, message);
    }

    @Override
    protected boolean isValidCode() {
        return getCode().indexOf(ErrorCode.BUSINESS_ERROR_PREFIX) == 0;
    }
}
