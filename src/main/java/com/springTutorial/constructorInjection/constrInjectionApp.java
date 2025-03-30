package com.springTutorial.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springTutorial.constructorInjection.Student;
import com.springTutorial.constructorInjection.Addition;

public class constrInjectionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springTutorial/constructorInjection/config.xml");
		
		Student s1 = context.getBean("student1", Student.class);
		
		Addition add = context.getBean("add", Addition.class);
		
		System.out.println(s1);
		add.sum();

	}

}
