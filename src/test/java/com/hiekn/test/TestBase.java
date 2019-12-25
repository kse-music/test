package com.hiekn.test;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestBase {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    @Ignore
	public void test() {
        int a = 2;
        assertEquals (2 , a);
	}

}
