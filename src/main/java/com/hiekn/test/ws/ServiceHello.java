package com.hiekn.test.ws;

import javax.jws.WebService;

@WebService
public interface ServiceHello {
	
	String getValue(String name);

}
