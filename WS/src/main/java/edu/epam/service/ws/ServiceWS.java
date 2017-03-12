package edu.epam.service.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "ws")
public class ServiceWS {
	
	@WebMethod(operationName = "test")
	public String test(){
		return "Test Service ";
	}

}
