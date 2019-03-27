package com.hiekn.test;

import cn.hiboot.mcn.core.util.McnUtils;
import org.junit.Test;

import java.io.IOException;

public class McnUtilTest extends TestBase{

    @Test
    public void testMcn() throws IOException {

        logger.info("{}",McnUtils.randomUUID());
        logger.info("{}",McnUtils.simpleUUID());

        logger.info("{}",McnUtils.isDigital("12"));

        //load prop
        //自动从指定的key中识别，环境变量优先级高于java属性
        logger.info("{}",McnUtils.loadProperties("a.properties","k"));

        McnUtils.copyFile("G:/TeamViewer_13.2.14327.0.exe", "d:/TeamViewer_13.2.14327.0.exe");

    }

}

