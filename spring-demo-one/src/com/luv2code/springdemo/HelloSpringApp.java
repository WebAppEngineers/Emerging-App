package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		//.create the spring container 
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
			
		//retrieve bean from spring container 
		Coach theCoach = context.getBean("myCoach", Coach.class);
		/*"myCoach"= bean id
		 Coach.class = interface*/
		
		//call  method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close the application context
		context.close();
		
		

	}

}
