package com.halo.demo.exception;

import lombok.Getter;

import java.io.Serial;

/**
 * @Description:
 * @author: halo_ry
 * @Date: 2023/9/18 10:20
 */
@Getter
public class RemoteCallException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 850632679679486532L;
    /**
     * 三方返回的响应码
     */
    private String code;

    public RemoteCallException(String code, String message) {
        super(message);
        this.code = code;
    }

    public RemoteCallException(String message) {
        this("0", message);
    }

}
