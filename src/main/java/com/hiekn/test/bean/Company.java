package com.hiekn.test.bean;

import com.hiekn.test.MarkObject;
import lombok.Data;

/**
 * describe about this class
 *
 * @author: DingHao
 * @date: 2019/6/29 17:16
 */
@Data
public class Company implements MarkObject {

    private String name;
    private Integer money;

    public Company(String a) {
        this.name = a;
    }
}
