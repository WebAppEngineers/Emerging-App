package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	
	private FortuneService fortuneService;
	// no argument constructor
	public TrackCoach() {
		
	}
	
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
	
		return "Wah kya baat : " + fortuneService.getFortune();
	}

}
