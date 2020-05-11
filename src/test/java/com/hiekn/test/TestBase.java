package com.hiekn.test;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestBase extends Assertions {

    protected final Logger log = LoggerFactory.getLogger(getClass());

    @Test
    @Ignore
	public void test() {
        int a = 2;
        assertEquals (2 , a);
	}

}
