package com.halo.demo.controller;

import com.halo.demo.dto.ServerResult;
import com.halo.demo.entity.People;
import com.halo.demo.service.IPeopleService;
import com.halo.demo.vo.req.PeopleReq;
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
 * @Date: 2023/9/18 10:12
 */
@RestController
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    private IPeopleService peopleService;

    @PostMapping("/getPeopleListByParam")
    public ServerResult<List<People>> getPeopleList(@Validated @RequestBody PeopleReq req) {
        return ServerResult.build(() -> peopleService.getPeopleListByParam(req));
    }
}
