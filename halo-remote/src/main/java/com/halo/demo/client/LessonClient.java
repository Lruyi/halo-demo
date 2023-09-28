package com.halo.demo.client;

import com.halo.demo.dto.CommonServerResult;
import com.halo.demo.remote.req.StudentSummaryReq;
import com.halo.demo.remote.resp.StudentLessonSummaryResp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @Description: 远程调用三方接口
 * @author: halo_ry
 * @Date: 2023/9/20 14:09
 */
@FeignClient(name = "lessonClient", url = "${remote.server.lesson.basePath}")
public interface LessonClient {

    @PostMapping("/aggregation/querySummaryByStudentUidAndDatePeriod")
    CommonServerResult<List<StudentLessonSummaryResp>> querySummaryByStudentUidAndDatePeriod(@RequestBody StudentSummaryReq req);
}
