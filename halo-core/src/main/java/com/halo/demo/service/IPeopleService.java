package com.halo.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.halo.demo.vo.req.PeopleReq;

import java.util.List;

/**
 * @Description:
 * @author: halo_ry
 * @Date: 2023/9/18 10:46
 */
public interface IPeopleService<People> extends IService<People> {

    List<People> getPeopleListByParam(PeopleReq req);
}
