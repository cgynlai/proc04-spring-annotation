package com.cyl.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cyl.spring.entity.Employee;

//to show this is a config class, similar to spring-context.xml
@Configuration
public class MyAnnotationConfiguration {
    //Bean注解相当于做了下面XML标签的配置，把方法的返回值放入IOC容器
	//<bean id="" class="com.cyl.spring.entity.Employee" />
	@Bean
	public Employee getEmployee() {
		return new Employee();
	}
	
	
	
}
