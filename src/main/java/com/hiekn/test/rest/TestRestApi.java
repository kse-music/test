package com.hiekn.test.rest;

import com.hiekn.boot.autoconfigure.base.model.result.RestResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("test")
@Produces(MediaType.APPLICATION_JSON)
@Api("测试")
@Controller
public class TestRestApi {

    @GET
    @Path("list")
    @ApiOperation("list")
    public RestResp list(){
        return new RestResp("Hello Spring Boot");
    }

    @POST
    @Path("post")
    @ApiOperation("post")
    public RestResp post(@QueryParam("userId") String userId,
                         @FormParam("bean")String bean){
        return new RestResp(userId);
    }

}
