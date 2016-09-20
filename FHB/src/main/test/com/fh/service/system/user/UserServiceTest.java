package com.fh.service.system.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fh.dao.DAO;
import com.fh.dao.DaoSupport;
import com.fh.util.PageData;

import junit.framework.TestCase;

public class UserServiceTest extends TestCase {
	
	private ApplicationContext applicationContext;  

	protected void setUp() throws Exception {
		
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/ApplicationContext.xml");
		
	}

	public void testFindByUId() {
		
		UserService userService = (UserService) applicationContext.getBean("user");
		
//		PageData pageData = userService.findByUId(1);
		
	}

}
