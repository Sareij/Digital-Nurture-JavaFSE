package com.cognizant.jwt.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.jwt.model.Country;

@Service
public class CountryService {

    private ApplicationContext context;

    public CountryService() {
        context = new ClassPathXmlApplicationContext("country.xml");
    }

    @SuppressWarnings("unchecked")
    public List<Country> getAllCountries() {
        return (List<Country>) context.getBean("countryList");
    }

    public Country getCountry(String code) {
        return getAllCountries().stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }
}