package com.hiekn.test.bean;

import com.hiekn.test.converter.MarkObject;
import lombok.Getter;
import lombok.Setter;

/**
 * describe about this class
 *
 * @author: DingHao
 * @date: 2019/6/29 17:16
 */
@Setter
@Getter
public class Company implements MarkObject {

    private String name;
    private Integer money;

}
