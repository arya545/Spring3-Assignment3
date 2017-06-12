package com.spring.session3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//Creating Application context
		ApplicationContext context=new ClassPathXmlApplicationContext("user-beans.xml");
		Person person=(Person) context.getBean("person");
		PersonType ptype=person.getType();
		System.out.println(ptype.getTypeName());
		
	}

}
