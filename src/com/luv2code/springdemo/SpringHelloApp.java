package com.luv2code.springdemo;

import com.sun.xml.internal.xsom.XSUnionSimpleType;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve the bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // lets call our new method for fortunes
        System.out.println(theCoach.getDailyFortune());

        // close application context
        context.close();
    }
}
