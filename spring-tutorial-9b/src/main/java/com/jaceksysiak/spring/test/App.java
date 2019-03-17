package com.jaceksysiak.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args){
		 
		ApplicationContext context = new ClassPathXmlApplicationContext("com/jaceksysiak/spring/test/beans/beans.xml");
		
		Person person = (Person) context.getBean("person");
		person.speak();
		System.out.println(person);
		
		 
		Address address = (Address) context.getBean("address");
		System.out.println(address);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
