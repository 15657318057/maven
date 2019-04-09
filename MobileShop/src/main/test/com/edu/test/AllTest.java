package com.edu.test;
import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edu.dao.UserDao;
import com.edu.model.User;

public class AllTest {

	
	 @SuppressWarnings("resource")
	 @Test
	 public void testDate(){
		 ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring/spring.xml");
	     UserDao s =(UserDao)ctx.getBean("userDao");
	     List<User> list =s.selectAll();
	     for(int i=0;i<list.size();i++){
	    	 System.out.println(list.get(i).getId()+"\t"+list.get(i).getUsername()+"\t"+list.get(i).getAddress()+"\t"+list.get(i).getStatus()+"\n");
	     }
	 
	 }
}
