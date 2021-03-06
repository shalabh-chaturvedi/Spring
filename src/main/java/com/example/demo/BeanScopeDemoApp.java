package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        //load spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve bean from Container
        Coach coach = context.getBean("coach", Coach.class);

        Coach alphaCoach = context.getBean("coach", Coach.class);

        //check if the beans are same
        boolean result = (coach == alphaCoach);
        System.out.println("Pointing to same object: " + result);
        System.out.println("Memory location for coach: " + coach);
        System.out.println("Memory location for alphaCoach: " + alphaCoach);

        //close context
        context.close();
    }
}
