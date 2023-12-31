package com.halo.demo.remote.config;

import com.halo.demo.constan.Constant;
import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * @Description:
 * @author: halo_ry
 * @Date: 2023/9/7 19:44
 */
public class XesOriginRequestInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {
        template.header(Constant.ORIGIN_NAME, Constant.ORIGIN_VALUE);
    }
}
