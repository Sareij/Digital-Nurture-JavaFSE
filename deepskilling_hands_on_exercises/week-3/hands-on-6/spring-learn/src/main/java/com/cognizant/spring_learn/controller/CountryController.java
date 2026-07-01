package com.cognizant.spring_learn.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.model.Country;

@RestController
public class CountryController {

    ApplicationContext context =
            new ClassPathXmlApplicationContext("country.xml");

    // Exercise 1
    @RequestMapping("/country")
    public Country getCountryIndia() {

        Country country = (Country) context.getBean("india");

        return country;
    }

    // Exercise 2
    @GetMapping("/countries")
    public List<Country> getAllCountries() {

        List<Country> countryList =
                (List<Country>) context.getBean("countryList");

        return countryList;
    }

}