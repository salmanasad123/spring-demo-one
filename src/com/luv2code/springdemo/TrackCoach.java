package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    // define a private field for the dependency
    private FortuneService fortuneService;

    // define a constructor for dependency injection
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it " + fortuneService.getFortune();
    }

    // define init and destroy methods ,this is our custom code/hook that will execute during bean life cycle

    // add an init method
    public void doMyStartupStuff(){
        System.out.println("Track Coach: Inside method - doMyStartupStuff()");
    }

    // add a destroy method, this method is called when spring destroys our bean
    public void doMyCleanupStuff(){
        System.out.println("Track Coach: Inside method - doMyCleanupStuff()");
    }
}
