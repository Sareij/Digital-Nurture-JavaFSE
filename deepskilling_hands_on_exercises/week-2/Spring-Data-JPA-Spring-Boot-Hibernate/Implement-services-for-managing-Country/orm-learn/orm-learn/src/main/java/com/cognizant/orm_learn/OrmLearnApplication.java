package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

	private static CountryService countryService;

	public static void main(String[] args) {

		ApplicationContext context =
				SpringApplication.run(OrmLearnApplication.class, args);

		countryService = context.getBean(CountryService.class);
//		testAddCountry();
//		testUpdateCountry();
//		testDeleteCountry();
//		testFindCountriesByPartialName();
//		testGetCountry();
	}
	private static void testFindCountriesByName() {

		List<Country> countries =
				countryService.findCountriesByPartialName("ou");

		countries.forEach(System.out::println);
	}
	private static void testFindCountriesByPartialName() {

		List<Country> countries =
				countryService.findCountriesByPartialName("ou");

		countries.forEach(System.out::println);
	}
	private static void testSearchCountry() {

		List<Country> countries =
				countryService.searchCountries("un");

		System.out.println("Size = " + countries.size());

		countries.forEach(System.out::println);
	}
//	private static void testSearchCountry() {
//
//		List<Country> countries =
//				countryService.searchCountries("an");
//
//		countries.forEach(System.out::println);
//	}
	private static void testAddCountry() {

		Country country = new Country();

		country.setCode("NP");
		country.setName("Nepal");

		countryService.addCountry(country);

		System.out.println("Country Added");
	}
	private static void testGetCountry() {

		System.out.println("Start");

		Country country = countryService.findCountryByCode("IN");

		System.out.println(country);

		System.out.println("End");
	}
	private static void testUpdateCountry() {

		Country country = countryService.findCountryByCode("IN");

		country.setName("India Updated");

		countryService.updateCountry(country);

		System.out.println("Country Updated");
	}
	private static void testDeleteCountry() {

		countryService.deleteCountry("AX");

		System.out.println("Country Deleted");
	}
}