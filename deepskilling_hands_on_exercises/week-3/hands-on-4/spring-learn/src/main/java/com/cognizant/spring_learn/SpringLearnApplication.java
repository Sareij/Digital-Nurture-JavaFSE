package com.cognizant.spring_learn;

import com.cognizant.spring_learn.model.Country;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

	public static void main(String[] args) {

		System.out.println("START");

		displayCountry();

		SpringApplication.run(SpringLearnApplication.class, args);

		System.out.println("END");
	}

	public static void displayCountry() {

		ApplicationContext context =
				new ClassPathXmlApplicationContext("country.xml");

		Country country =
				context.getBean("country", Country.class);

		System.out.println(country);

	}

}