package com.hiekn.test.rest;

import com.hiekn.boot.autoconfigure.base.model.result.RestResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("test")
@Api("测试")
@Controller
public class TestRestApi {

    @GET
    @Path("list")
    @ApiOperation("列表")
    public RestResp list(){
        return new RestResp("Hello Spring Boot");
    }
}
