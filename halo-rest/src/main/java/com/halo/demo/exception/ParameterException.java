package com.halo.demo.exception;

import java.io.Serial;

/**
 * 参数异常
 * @author
 */
public class ParameterException extends BaseException {

    @Serial
    private static final long serialVersionUID = 845578631484191582L;

    public ParameterException(ErrorCode errorCode, String message) {
        super(errorCode, message);
    }

    public ParameterException(ErrorCode errorCode) {
        super(errorCode);
    }

    public ParameterException(String message) {
        this(ErrorCode.PARAMETER_ERROR, message);
    }

    @Override
    protected boolean isValidCode() {
        return getCode().indexOf(ErrorCode.PARAMETER_ERROR_PREFIX) == 0;
    }
}
