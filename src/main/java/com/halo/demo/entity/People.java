package com.halo.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description:
 * @author: halo_ry
 * @Date: 2023/9/15 16:39
 */
@Data
@TableName("tb_people")
@JsonIgnoreProperties(ignoreUnknown = true)
public class People implements Serializable {

    @Serial
    private static final long serialVersionUID = -2745729702195447726L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Integer id;

    private String name;

    private Integer age;

    /**
     * 1-白种人,2-黄种人,3-黑种人,4-混血儿
     */
    private Integer type;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    /**
     * 国籍
     */
    private String nationality;

    @TableField(value = "ext_1")
    private String peopleType;

    @TableField(value = "ext_2")
    private Integer grade;
}
