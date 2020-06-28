package com.hiekn.test.bean;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * describe about this class
 *
 * @author DingHao
 * @since 2019/6/29 17:16
 */
@Setter
@Getter
public class UserBean {

    private String name;

    private Integer age;

    private Company company;

    private List<Company> companies;

}
