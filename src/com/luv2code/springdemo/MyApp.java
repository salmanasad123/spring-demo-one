package com.luv2code.springdemo;

public class MyApp {

    public static void main(String[] args) {

        // create the object
        Coach theCoach = new TrackCoach(new HappyFortuneService()); // any coach implementation will work that has getDailyWorkout() method

        // use the object
        System.out.println(theCoach.getDailyWorkout()); // any coach implementation will work
    }
}
