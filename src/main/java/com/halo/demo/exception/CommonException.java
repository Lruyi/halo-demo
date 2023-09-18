package com.halo.demo.exception;

import lombok.Getter;

import java.io.Serial;

/**
 * @Description:
 * @author: halo_ry
 * @Date: 2023/9/18 10:18
 */
@Getter
public class CommonException extends RuntimeException {


    @Serial
    private static final long serialVersionUID = -7858578142907699499L;
    private String code;

    public CommonException(String code) {
        super();
        this.code=code;
        // TODO Auto-generated constructor stub
    }

    public CommonException(String code,String arg0, Throwable arg1, boolean arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3);
        this.code=code;
    }

    public CommonException(String code,String arg0, Throwable arg1) {
        super(arg0, arg1);
        this.code=code;
    }

    public CommonException(String code,String arg0) {
        super(arg0);
        this.code=code;
    }

    public CommonException(String code,Throwable arg0) {
        super(arg0);
        this.code=code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
