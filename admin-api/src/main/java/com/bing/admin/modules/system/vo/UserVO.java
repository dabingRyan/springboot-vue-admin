package com.bing.admin.modules.system.vo;

import lombok.Data;

/**
 * @desc:
 * @author: Ryan
 * @date: 2020/7/21 17:27
 **/
@Data
public class UserVO{
    private Long id;
    private String loginName;
    private String nickName;
    private String mobile;
    private String email;
}
