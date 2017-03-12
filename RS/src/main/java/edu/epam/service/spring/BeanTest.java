package edu.epam.service.spring;

import org.springframework.stereotype.Component;

@Component("testBean")
public class BeanTest {
	
	private String str = "Test Bean";

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}
