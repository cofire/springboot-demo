package com.cofire.swagger.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @ClassName TestController
 * @Author Ly
 * @date 2020.05.21 10:41
 */
@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/test1")
    @ApiOperation("测试接口1")
    @ApiImplicitParam(name = "id", value = "id", defaultValue = "99", required = true)
    public String tes1() {
        return "test1";
    }
}
