package com.halo.demo.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: halo_ry
 * @Date: 2023/9/15 14:53
 */
@Component
public class MyFristJobHandler {

    @XxlJob("myFristJobHandler")
    public ReturnT<String> execute() {
        XxlJobHelper.log("MyFristJobHandler execute ... ");
        System.out.println("MyFristJobHandler execute ... ");
        XxlJobHelper.log("执行成功");
        return ReturnT.SUCCESS;
    }
}
