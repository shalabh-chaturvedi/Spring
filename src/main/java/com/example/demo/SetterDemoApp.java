package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BaseballCoach baseballCoach = context.getBean("baseballCoach", BaseballCoach.class);

        System.out.println(baseballCoach.workout());
        System.out.println(baseballCoach.getDailyFortune());
        System.out.println(baseballCoach.getEmail());
        System.out.println(baseballCoach.getTeam());

        context.close();
    }
}
