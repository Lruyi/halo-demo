package com.halo.demo.exception;


import java.io.Serial;

/**
 * 基础异常类
 * @author
 */
public class BaseException extends CommonException {

    @Serial
    private static final long serialVersionUID = -81753615473100629L;

    public BaseException(String code, String message, Throwable cause) {
        super(code, message, cause);
        if(!isValidCode()){
            throw new RuntimeException("Invalid error code!");
        }
    }

    public BaseException(String code, String message) {
        super(code, message);
        if(!isValidCode()){
            throw new RuntimeException("Invalid error code!");
        }
    }

    public BaseException(ErrorCode errorCode, String message, Throwable cause) {
        this(errorCode.getCode(), message, cause);
    }

    public BaseException(ErrorCode errorCode, Throwable cause) {
        this(errorCode.getCode(), errorCode.getDesc(), cause);
    }

    public BaseException(ErrorCode errorCode, String message) {
        this(errorCode.getCode(), message);
    }

    public BaseException(ErrorCode errorCode) {
        this(errorCode.getCode(), errorCode.getDesc());
    }

    protected boolean isValidCode(){
        return true;
    }
}
