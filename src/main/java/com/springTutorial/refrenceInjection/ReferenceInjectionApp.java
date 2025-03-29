package com.springTutorial.refrenceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springTutorial.refrenceInjection.Student;

public class ReferenceInjectionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springTutorial/refrenceInjection/config.xml");
		
		Student student1 = (Student) context.getBean("student1");
		// Student student1 = context.getBean("student1", Student.class);
		
		student1.displayStudent();

	}

}
