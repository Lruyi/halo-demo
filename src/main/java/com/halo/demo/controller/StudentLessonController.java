package com.halo.demo.controller;

import com.halo.demo.dto.ServerResult;
import com.halo.demo.remote.client.LessonClient;
import com.halo.demo.remote.req.StudentSummaryReq;
import com.halo.demo.remote.resp.StudentLessonSummaryResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @author: halo_ry
 * @Date: 2023/9/20 17:34
 */
@RestController
@RequestMapping("/lesson")
public class StudentLessonController {

    @Autowired(required = false)
    private LessonClient lessonClient;

    @PostMapping("/querySummaryList")
    public ServerResult<List<StudentLessonSummaryResp>> querySummaryList(@Validated @RequestBody StudentSummaryReq req) {
        return ServerResult.build(() -> lessonClient.querySummaryByStudentUidAndDatePeriod(req).getData());
    }
}
