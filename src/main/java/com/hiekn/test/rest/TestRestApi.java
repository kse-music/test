package com.hiekn.test.rest;

import cn.hiboot.mcn.core.model.result.RestResp;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;

@RequestMapping("test")
@RestController
@Validated
public class TestRestApi {

    @Autowired
    private Gson gson;

    @GetMapping("list")
    public RestResp list(String query) {
        return new RestResp(query);
    }

    @PostMapping("json")
    public RestResp postJson(@Validated @RequestBody UserBean userBean) {
        return new RestResp(userBean);
    }

    @PostMapping("urlencoded")
    public RestResp postUrlencoded(String name,@Validated UserBean userBean) {
        return new RestResp(userBean);
    }

    @PostMapping("formData")
    public RestResp postFormData(String name,UserBean userBean) {
        return new RestResp(userBean);
    }

    static class UserBean {

        private String name;

        @Max(200)
        private Integer age;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

    }
}
