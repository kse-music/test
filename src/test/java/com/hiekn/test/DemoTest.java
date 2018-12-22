package com.hiekn.test;

import com.hiekn.boot.autoconfigure.base.util.McnUtils;
import com.hiekn.boot.autoconfigure.base.util.MybatisGenUtil;
import org.junit.Test;

import java.util.Properties;

public class DemoTest extends TestBase{


    @Test
    public void testDemo(){
        Properties properties = McnUtils.loadProperties("generator.properties");
        logger.info("{}",properties);

    }

    @Test
    public void genMapperAndXml() {
        MybatisGenUtil.genMapperAndXml();
    }

}
