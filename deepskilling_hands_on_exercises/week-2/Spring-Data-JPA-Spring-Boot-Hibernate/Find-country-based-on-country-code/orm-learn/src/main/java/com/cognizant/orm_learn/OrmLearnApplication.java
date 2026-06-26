package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

	private static CountryService countryService;
	public static void main(String[] args)
			throws CountryNotFoundException {

		ApplicationContext context =
				SpringApplication.run(
						OrmLearnApplication.class, args);

		countryService =
				context.getBean(CountryService.class);

		getAllCountriesTest();
	}
	private static void getAllCountriesTest()
			throws CountryNotFoundException {

		System.out.println("Start");

		Country country =
				countryService.findCountryByCode("IN");

		System.out.println(country);

		System.out.println("End");
	}

}