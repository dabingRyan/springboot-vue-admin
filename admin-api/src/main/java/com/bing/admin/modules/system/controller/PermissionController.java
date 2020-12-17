package com.bing.admin.modules.system.controller;

import com.bing.admin.common.domain.Result;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc:
 * @author: Ryan
 * @date: 2020/12/17 15:06
 **/
@Data
@RestController
@RequestMapping("api/permission")
public class PermissionController {

    @PostMapping("list")
    public Result list() {
        return null;
    }

    @PostMapping("save")
    public Result save() {
        return null;
    }

    @GetMapping("getById")
    public Result getById(Long id) {
        return null;
    }
}
