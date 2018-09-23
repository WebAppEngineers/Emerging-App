package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		//.create the spring container 
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
			
		//retrieve bean from spring container 
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		
		/*"myCoach" is bean id
		 Coach.class is interface*/
		
		//call  method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call new method for fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the application context
		context.close();
		
		

	}

}
