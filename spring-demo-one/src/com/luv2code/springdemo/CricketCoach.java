package com.luv2code.springdemo;

//*** Setter injection ***

public class CricketCoach implements Coach {

	// we need helper AKA dependency 
	private FortuneService fortuneService;
	
	//**injecting literal values 
	//add new fields for emailAddress and team 
	private String emailAddress;
	private String team;
	
	//create no-arg constructor 
	public CricketCoach() {
		//sysout print something to see whats going on how it works
		System.out.println("CricketCoach: inside no-arg constructor");
		
	}
	
	//**injecting literal values 
    //Step1: create setter method(s) in your class for injections	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
        this.team = team;
	}
	
	//Now Step1: create  setter method in you class for injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes a day";
	}

	@Override
	public String getDailyFortune() {
		 
		return fortuneService.getFortune();
	}

}
