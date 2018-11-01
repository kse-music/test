package com.hiekn.test.rest;

import com.google.common.collect.Lists;
import com.hiekn.boot.autoconfigure.base.model.result.RestResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("test")
@Produces(MediaType.APPLICATION_JSON)
@Api("测试")
@Controller
public class TestRestApi {

    @Autowired
    private HttpServletRequest request;

    @GET
    @Path("list")
    @ApiOperation("列表")
    public RestResp list(){
        return new RestResp("Hello Spring Boot");
    }

    @POST
    @Path("post")
    @ApiOperation("post")
    public RestResp post(@QueryParam("userId") String userId,
                         @FormParam("bean")String bean,
                         @FormParam("bean2")String bean2){
        return new RestResp(request.getParameterMap());
    }

    @POST
    @Path("extract")
    @ApiOperation("extract")
    public List<WordBean> extract(@FormParam("text")String text){
        return Lists.newArrayList(new WordBean("test","test"),new WordBean("test2","test2"),new WordBean("test","test"));
    }

}
