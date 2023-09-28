package com.halo.demo.exception;

import java.io.Serial;

/**
 * @Description:
 * @author: halo_ry
 * @Date: 2022/6/13 19:52
 */
public class ApiClosedException extends BaseException {

    @Serial
    private static final long serialVersionUID = 6879502555190164180L;

    public ApiClosedException(ErrorCode errorCode, String message) {
        super(errorCode, message);
    }

    public ApiClosedException(ErrorCode errorCode) {
        super(errorCode);
    }

    public ApiClosedException(String message) {
        this(ErrorCode.BUSINESS_API_CLOSED, message);
    }
}
