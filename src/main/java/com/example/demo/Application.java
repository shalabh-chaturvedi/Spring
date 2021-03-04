package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		if (args == null || args.length < 1) {
			System.err.println("Context File not provided. Exiting..");
			System.exit(1);
		}
		studentStart(args[0]);
		coachWorkout(args[0]);
	}

	private static void studentStart(String contextFile) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(contextFile);
		Student student=context.getBean("studentbean", Student.class);
		student.displayInfo();
		context.close();
	}

	private static void coachWorkout(String contextFile){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(contextFile);
		Coach coach = context.getBean("coach", Coach.class);
		System.out.println(coach.workout());
		System.out.println(coach.getDailyFortune());
		context.close();
	}
}
