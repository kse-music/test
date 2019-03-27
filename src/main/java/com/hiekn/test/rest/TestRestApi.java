package com.hiekn.test.rest;

import cn.hiboot.mcn.core.model.result.RestResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;

@RequestMapping("test")
@Api(tags = "测试",description = "test")
@RestController
@Validated
public class TestRestApi {

    @GetMapping("list")
    @ApiOperation("list")
    public RestResp list(){
        return new RestResp("Hello Spring Boot");
    }

    @PostMapping("post")
    @ApiOperation("post")
    public RestResp post(@Max(10) Integer userId, String bean){
        return new RestResp(userId);
    }

}
