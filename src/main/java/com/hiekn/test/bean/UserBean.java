package com.hiekn.test.bean;

import lombok.Data;

import javax.validation.constraints.Max;
import java.util.List;

/**
 * describe about this class
 *
 * @author: DingHao
 * @date: 2019/6/29 17:16
 */
@Data
public class UserBean {

    private String name;

    @Max(200)
    private Integer age;

    private Company company;

    private List<Company> companies;

}
