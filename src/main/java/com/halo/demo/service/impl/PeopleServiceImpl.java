package com.halo.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.halo.demo.entity.People;
import com.halo.demo.mapper.PeopleMapper;
import com.halo.demo.service.IPeopleService;
import com.halo.demo.vo.req.PeopleReq;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * @Description:
 * @author: halo_ry
 * @Date: 2023/9/18 10:51
 */
@Slf4j
@Service
public class PeopleServiceImpl extends ServiceImpl<PeopleMapper, People> implements IPeopleService<People> {

    @Autowired
    private PeopleMapper peopleMapper;
    @Override
    public List<People> getPeopleListByParam(PeopleReq req) {
        return peopleMapper.selectList(new LambdaQueryWrapper<People>()
                .eq(Objects.nonNull(req.getId()), People::getId, req.getId())
                .eq(StringUtils.isNotBlank(req.getName()), People::getName, req.getName())
                .eq(Objects.nonNull(req.getAge()), People::getAge, req.getAge())
                .eq(Objects.nonNull(req.getType()), People::getType, req.getType())
                .eq(StringUtils.isNotBlank(req.getNationality()), People::getNationality, req.getNationality())
        );
    }
}
