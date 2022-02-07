package com.cyl.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cyl.spring.MyAnnotationConfiguration;
import com.cyl.spring.entity.Employee;

public class SpringTest {
	
	public static void main(String[] args) {
		// In xml we use new ClassPathXmlApplicationContext("") to get IOC object
		//annotation way to get IOC object
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyAnnotationConfiguration.class);
		
		
		//get bean from IOC container
		Employee employee = applicationContext.getBean(Employee.class);
		System.out.println(employee);
		applicationContext.close();
	}

}
