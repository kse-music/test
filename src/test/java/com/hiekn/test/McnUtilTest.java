package com.hiekn.test;

import com.hiekn.boot.autoconfigure.base.util.McnUtils;
import org.junit.Test;

public class McnUtilTest extends TestBase{

    @Test
    public void testMcn(){

        logger.info("{}",McnUtils.randomUUID());
        logger.info("{}",McnUtils.simpleUUID());

        logger.info("{}",McnUtils.isDigital("12"));

        //load prop
        //自动从指定的key中识别，环境变量优先级高于java属性

        logger.info("{}",McnUtils.loadProperties("a.properties","k"));

    }

}