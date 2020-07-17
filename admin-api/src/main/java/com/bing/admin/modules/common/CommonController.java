package com.bing.admin.modules.common;

import com.bing.admin.common.domain.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc:
 * @author: Ryan
 * @date: 2020/7/15 18:26
 **/
@RestController
@RequestMapping("/api/common")
public class CommonController {

    @GetMapping("test")
    public Result testApi() {
        Result result = new Result();
        result.setCode("0");
        result.setMessage("成功");
        return result;
    }
}
