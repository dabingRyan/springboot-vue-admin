package com.bing.admin.modules.system.controller;

import com.bing.admin.common.constant.Constant;
import com.bing.admin.common.domain.Result;
import com.bing.admin.modules.system.form.LoginForm;
import com.bing.admin.modules.system.vo.UserInfoVO;
import com.google.common.collect.Lists;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @desc:
 * @author: Ryan
 * @date: 2020/12/17 17:51
 **/
@RestController
@RequestMapping("/api")
public class LoginController {

    @PostMapping("login")
    public Result<Map<String,Object>> login(@RequestBody LoginForm loginForm) {
        Result<Map<String, Object>> result = new Result<>();
        Map<String, Object> data = new HashMap<>(1);
        data.put("token", UUID.randomUUID().toString());
        result.setCode(Constant.SUCCESS);
        result.setData(data);
        return result;
    }

    @GetMapping("userInfo")
    public Result<UserInfoVO> login(@RequestParam("token") String token) {
        Result<UserInfoVO> result = new Result<>();
        UserInfoVO userInfoVO = new UserInfoVO();
        userInfoVO.setName("超级管理员");
        userInfoVO.setIntroduction("本系统的超级管理员");
        userInfoVO.setAvatar("https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        userInfoVO.setRoles(Lists.newArrayList("admin"));
        result.setCode(Constant.SUCCESS);
        result.setData(userInfoVO);
        return result;
    }
}
