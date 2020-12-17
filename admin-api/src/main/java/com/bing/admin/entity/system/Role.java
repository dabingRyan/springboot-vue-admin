package com.bing.admin.entity.system;

import com.bing.admin.common.domain.BaseDomain;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @desc:
 * @author: Ryan
 * @date: 2020/7/21 17:54
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class Role extends BaseDomain {
    /**角色中文名称*/
    private String cname;
    /**角色英文名称*/
    private String ename;

    /**权限列表*/
    private List<Permission> permissionList;
}
