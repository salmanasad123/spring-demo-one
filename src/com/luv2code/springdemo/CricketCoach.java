package com.luv2code.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    //add new fields to hold email address and team values
    private String emailAddress;
    private String team;

    public CricketCoach() {
        System.out.println("Inside the no-arg CricketCoach Constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your cover drive";
    }

    @Override
    public String getDailyFortune() {
        return "Cricket Coach: " + fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket Coach: Inside the setter method for - setFortuneService");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Cricket Coach: Inside setter method for - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("Cricket Coach: Inside setter method for - setTeam");
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }
}
