package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		//create the object
		/*BaseballCoach theCoach = new BaseballCoach();*/
		
		// code refactoring
		//use the interface
		/*Coach theCoach = new BaseballCoach();*/
		
		//now working with different type of coach
		Coach theCoach = new TrackCoach();
		
		
		//use the object 
		System.out.println(theCoach.getDailyWorkout());
		
	}

}
