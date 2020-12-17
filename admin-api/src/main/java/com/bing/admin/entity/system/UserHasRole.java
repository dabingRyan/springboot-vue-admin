package com.bing.admin.entity.system;

import lombok.Data;

/**
 * @desc:
 * @author: Ryan
 * @date: 2020/7/21 18:15
 **/
@Data
public class UserHasRole {
    private Long id;
    private Long userId;
    private Long roleId;
}
