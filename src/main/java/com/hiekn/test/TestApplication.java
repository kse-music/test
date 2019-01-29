package com.hiekn.test;

import com.hiekn.test.dao.NewsMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(TestApplication.class, args);
        NewsMapper bean = run.getBean(NewsMapper.class);
        System.out.println(bean.selectByCondition(null));
    }



}
