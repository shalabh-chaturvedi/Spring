package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		if (args == null || args.length < 1) {
			System.err.println("Context File not provided. Exiting..");
			System.exit(1);
		}
		else
			start(args[0]);
	}

	private static void start(String contextFile) {
		Resource resource=new ClassPathResource(contextFile);
		BeanFactory factory=new XmlBeanFactory(resource);

		Student student=(Student)factory.getBean("studentbean");
		student.displayInfo();
	}
}
