package com.bing.admin.entity.system;

import com.bing.admin.common.domain.BaseDomain;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.List;

/**
 * @desc: 用户实体
 * @author: Ryan
 * @date: 2020/7/21 17:39
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class User extends BaseDomain {
    /**登录名*/
    private String loginName;
    /**密码*/
    private String password;
    /**头像*/
    private String headImage;
    /**昵称*/
    private String nickName;
    /**手机号*/
    private String mobile;
    /**电子邮箱*/
    private String email;
    /**上次登录时间*/
    private Date lastLoginTime;

    /**角色列表*/
    private List<Role> roleList;

}
