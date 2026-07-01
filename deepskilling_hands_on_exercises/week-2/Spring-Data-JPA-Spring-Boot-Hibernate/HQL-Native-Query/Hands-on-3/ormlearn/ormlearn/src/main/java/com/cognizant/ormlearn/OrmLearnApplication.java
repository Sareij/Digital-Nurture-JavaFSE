package com.cognizant.ormlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.ormlearn.model.Attempt;
import com.cognizant.ormlearn.model.AttemptOption;
import com.cognizant.ormlearn.model.AttemptQuestion;
import com.cognizant.ormlearn.service.AttemptService;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

	private static final Logger LOGGER =
			LoggerFactory.getLogger(OrmLearnApplication.class);

	@Autowired
	private AttemptService attemptService;

	public static void main(String[] args) {
		SpringApplication.run(OrmLearnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		LOGGER.info("Start");

		testGetAttempt();

		LOGGER.info("End");
	}

	private void testGetAttempt() {

		LOGGER.info("Start");

		Attempt attempt = attemptService.getAttempt(1, 1);

		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("Username : " + attempt.getUser().getName());
		System.out.println("Attempt Date : " + attempt.getDate());
		System.out.println("--------------------------------------------");
		System.out.println();

		for (AttemptQuestion aq : attempt.getAttemptQuestionList()) {

			System.out.println(aq.getQuestion().getText());

			for (AttemptOption ao : aq.getAttemptOptionList()) {

				System.out.printf("%-25s %-8s %-8s%n",
						ao.getOption().getText(),
						aq.getQuestion().getScore(),
						ao.isAnswer());

			}

			System.out.println();
		}

		LOGGER.info("End");

	}

}