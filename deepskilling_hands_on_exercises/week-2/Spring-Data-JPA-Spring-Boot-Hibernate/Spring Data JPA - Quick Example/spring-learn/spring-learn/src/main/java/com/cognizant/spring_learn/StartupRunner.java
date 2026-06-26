package com.cognizant.spring_learn;

import com.cognizant.spring_learn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    @Override
    public void run(String... args) {

        countryService.getAllCountries()
                .forEach(country ->
                        System.out.println(country.getCode() + " - " + country.getName()));
    }
}