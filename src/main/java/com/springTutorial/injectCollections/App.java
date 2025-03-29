package com.springTutorial.injectCollections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springTutorial.injectCollections.*;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "Collection injection" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springTutorial/injectCollections/config.xml");
        Student obj1 = (Student) context.getBean("listBean");
        Student obj2 = (Student) context.getBean("setBean");
        Student obj3 = (Student) context.getBean("mapBean");
        Student obj4 = (Student) context.getBean("propertiesBean");
        
        obj1.displayNames2();
        obj2.displayNames();
        obj3.displayEmployees();
        obj4.displayProperties();
        
        
        //we can define properties and its values in sigle bean
        obj1.displayNames();
        
        
	}

}
