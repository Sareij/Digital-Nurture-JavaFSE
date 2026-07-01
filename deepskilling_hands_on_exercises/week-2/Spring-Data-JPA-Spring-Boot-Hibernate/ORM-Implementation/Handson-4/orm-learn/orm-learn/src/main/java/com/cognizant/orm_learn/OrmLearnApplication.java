package com.cognizant.orm_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.cognizant.orm_learn.model.Department;
import com.cognizant.orm_learn.model.Employee;
import com.cognizant.orm_learn.service.DepartmentService;
import com.cognizant.orm_learn.service.EmployeeService;
import com.cognizant.orm_learn.service.SkillService;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.Date;

@SpringBootApplication
public class OrmLearnApplication {

	private static EmployeeService employeeService;
	private static DepartmentService departmentService;
	private static SkillService skillService;

	private static final Logger LOGGER =
			LoggerFactory.getLogger(OrmLearnApplication.class);

	public static void main(String[] args) {



		ConfigurableApplicationContext context =
				SpringApplication.run(OrmLearnApplication.class, args);

		employeeService = context.getBean(EmployeeService.class);
		departmentService = context.getBean(DepartmentService.class);
		skillService = context.getBean(SkillService.class);

//		testGetEmployee();

//		testAddEmployee();

		testUpdateEmployee();
	}

	private static void testGetEmployee() {

		LOGGER.info("Start");

		Employee employee = employeeService.get(1);

		LOGGER.debug("Employee : {}", employee);

		LOGGER.debug("Department : {}", employee.getDepartment());

		LOGGER.info("End");
	}

	private static void testAddEmployee() {

		LOGGER.info("Start");

		Employee employee = new Employee();

		employee.setName("Saranya");

		employee.setSalary(50000);

		employee.setPermanent(true);

		employee.setDateOfBirth(Date.valueOf("2004-06-15").toLocalDate());

		Department department = departmentService.get(1);

		employee.setDepartment(department);

		employeeService.save(employee);

		LOGGER.debug("Employee : {}", employee);

		LOGGER.info("End");
	}

	private static void testUpdateEmployee() {

		LOGGER.info("Start");

		// Get existing employee
		Employee employee = employeeService.get(1);

		// Get a different department
		Department department = departmentService.get(2);

		// Change employee's department
		employee.setDepartment(department);

		// Update employee
		employeeService.save(employee);

		LOGGER.debug("Updated Employee : {}", employee);

		LOGGER.info("End");
	}
}
