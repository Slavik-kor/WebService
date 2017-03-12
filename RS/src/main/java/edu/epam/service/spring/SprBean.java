package edu.epam.service.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bean")
public class SprBean {
	
	@Autowired
	private BeanTest testBean;

	public BeanTest getTestBean() {
		return testBean;
	}

	public void setTestBean(BeanTest testBean) {
		this.testBean = testBean;
	}

	


}
