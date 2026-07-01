package com.cognizant.ormlearn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.service.EmployeeService;

@SpringBootApplication
public class SpringDataJpaHqlPermanentEmployeesApplication implements CommandLineRunner {

	private static final Logger LOGGER =
			LoggerFactory.getLogger(SpringDataJpaHqlPermanentEmployeesApplication.class);

	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaHqlPermanentEmployeesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		LOGGER.info("Start");

		testGetEmployee();

		LOGGER.info("End");
	}
	private void testGetEmployee() {

		LOGGER.info("Start");

		Employee employee = employeeService.getEmployee(1);

		LOGGER.debug("Employee : {}", employee);

		LOGGER.debug("Department : {}", employee.getDepartment());

		LOGGER.debug("Skills : {}", employee.getSkillList());

		LOGGER.info("End");
	}

	private void testGetAllPermanentEmployees() {

		LOGGER.info("Start");

		List<Employee> employees = employeeService.getAllPermanentEmployees();

		LOGGER.debug("Permanent Employees : {}", employees);

		employees.forEach(employee ->
				LOGGER.debug("Skills : {}", employee.getSkillList()));

		LOGGER.info("End");
	}
}