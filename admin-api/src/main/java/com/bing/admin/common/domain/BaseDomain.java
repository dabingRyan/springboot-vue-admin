package com.bing.admin.common.domain;

import lombok.Data;

import java.util.Date;

/**
 * @desc: 基础实体
 * @author: Ryan
 * @date: 2020/7/16 14:29
 **/
@Data
public class BaseDomain {
    /**主键*/
    protected Long id;
    /**删除标记*/
    protected Integer isDelete;
    /**创建时间*/
    protected Date createTime;
    /**创建者*/
    protected String createUser;
    /**更新时间*/
    protected Date updateTime;
    /**更新者*/
    protected String updateUser;
    /**版本*/
    protected Integer version;
    /**备注*/
    protected String remarks;
}
