package com.cognizant.spring_learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.CountryService;

@RestController
public class CountryController {

    ApplicationContext context =
            new ClassPathXmlApplicationContext("country.xml");

    @Autowired
    private CountryService countryService;

    // Exercise 1
    @RequestMapping("/country")
    public Country getCountryIndia() {

        return (Country) context.getBean("india");
    }

    // Exercise 2
    @GetMapping("/countries")
    public List<Country> getAllCountries() {

        return (List<Country>) context.getBean("countryList");
    }

    // Exercise 3
    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {

        return countryService.getCountry(code);
    }

}