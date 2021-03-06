package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {
        //load spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        //retrieve bean from Container
        Coach coach = context.getBean("coach", Coach.class);

        System.out.println(coach.workout());


        //close context
        context.close();
    }
}
