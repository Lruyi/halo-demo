package com.halo.demo.vo.req;

import lombok.Data;

/**
 * @Description:
 * @author: halo_ry
 * @Date: 2023/9/18 10:28
 */
@Data
public class PeopleReq {

    private Integer id;

    private String name;

    private Integer age;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 国籍
     */
    private String nationality;
}
