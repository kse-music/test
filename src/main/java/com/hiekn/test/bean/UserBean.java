package com.hiekn.test.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.Max;

/**
 * describe about this class
 *
 * @author: DingHao
 * @date: 2019/6/29 17:16
 */
public class UserBean {

    private String name;

    @Max(200)
    private Integer age;
    @JsonIgnore
    private Company company;

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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
