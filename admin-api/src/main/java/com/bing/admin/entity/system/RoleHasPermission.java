package com.bing.admin.entity.system;

import lombok.Data;

/**
 * @desc:
 * @author: WB38113
 * @date: 2020/7/21 18:14
 **/
@Data
public class RoleHasPermission {
    private Long id;
    private Long roleId;
    private Long permissionId;
}
