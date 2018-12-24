package com.hiekn.test;

import com.hiekn.boot.autoconfigure.base.util.McnUtils;
import org.junit.Test;

public class DemoTest extends TestBase{


    @Test
    public void testDemo(){
        logger.info("{}",McnUtils.randomUUID());
        logger.info("{}",McnUtils.simpleUUID());
    }

}
