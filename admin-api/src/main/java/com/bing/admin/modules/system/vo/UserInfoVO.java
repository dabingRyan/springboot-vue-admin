package com.bing.admin.modules.system.vo;

import lombok.Data;

import java.util.List;

/**
 * @desc:
 * @author: Ryan
 * @date: 2020/12/17 17:55
 **/
@Data
public class UserInfoVO {
    private String name;
    private String avatar;
    private String introduction;
    private List<String> roles;
}
