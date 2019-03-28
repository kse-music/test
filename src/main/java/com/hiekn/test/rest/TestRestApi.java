package com.hiekn.test.rest;

import cn.hiboot.mcn.core.model.result.RestResp;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("post")
    public RestResp post(@Validated UserBean userBean) {
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
