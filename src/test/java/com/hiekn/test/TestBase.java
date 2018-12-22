package com.hiekn.test;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class TestBase {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    @Ignore
	public void test() {
        int a = 2;
        assertEquals (2 , a);
	}

}
