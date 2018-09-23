package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	//Constructor injection
	
	//spring dependency injection
	
	//STEP1 : define a private field for the dependency 
	
	//FortuneService is interface and fortuneService is variable 
	
	private FortuneService fortuneService;
	
	//STEP2 : Define a constructor for dependency injection 
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
		
	}

	@Override
	public String getDailyFortune() {
		
		//STEP3 : use my fortuneService to get a fortune 
		//Dependency=Helper
		
		
		return fortuneService.getFortune();
	}

}
