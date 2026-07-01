package com.cognizant.orm_learn;

import com.cognizant.orm_learn.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class OrmlearnApplication implements CommandLineRunner {

	@Autowired
	private StockRepository stockRepository;

	public static void main(String[] args) {
		SpringApplication.run(OrmlearnApplication.class, args);
	}
	@Override
	public void run(String... args) {

		stockRepository.findTop3ByCodeOrderByCloseAsc("NFLX")
				.forEach(System.out::println);

	}
}