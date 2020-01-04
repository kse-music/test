package com.hiekn.test.rest;

import cn.hiboot.mcn.core.model.result.RestResp;
import com.hiekn.test.bean.UserBean;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("test")
@RestController
@Validated
public class TestRestApi {

    @GetMapping("list")
    public RestResp<String> list(String query) {
        return new RestResp<>(query);
    }

    @PostMapping("json")
    public RestResp<UserBean> postJson(@Validated @RequestBody UserBean userBean) {
        return new RestResp<>(userBean);
    }

    @PostMapping("urlencoded")
    public RestResp<UserBean> postUrlencoded(@Validated UserBean userBean) {
        return new RestResp<>(userBean);
    }

    @PostMapping("formData")
    public RestResp<UserBean> postFormData(String name,UserBean userBean) {
        return new RestResp<>(userBean);
    }

}
