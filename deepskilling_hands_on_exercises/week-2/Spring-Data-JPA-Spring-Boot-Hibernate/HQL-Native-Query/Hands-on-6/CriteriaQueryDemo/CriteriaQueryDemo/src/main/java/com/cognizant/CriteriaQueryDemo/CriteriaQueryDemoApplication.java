package com.cognizant.CriteriaQueryDemo;

import com.cognizant.CriteriaQueryDemo.model.Department;
import com.cognizant.CriteriaQueryDemo.model.Employee;
import com.cognizant.CriteriaQueryDemo.repository.EmployeeRepository;
import com.cognizant.CriteriaQueryDemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CriteriaQueryDemoApplication implements CommandLineRunner {

	@Autowired
	EmployeeRepository repository;

	@Autowired
	EmployeeService service;

	public static void main(String[] args) {

		SpringApplication.run(CriteriaQueryDemoApplication.class,args);

	}

	@Override
	public void run(String... args) {

		if(repository.count()==0){

			Department payroll=new Department("Payroll");
			Department admin=new Department("Admin");
			Department development=new Department("Development");

			repository.save(new Employee("John",8000,payroll));
			repository.save(new Employee("Peter",6000,payroll));
			repository.save(new Employee("David",7000,payroll));

			repository.save(new Employee("Mary",9000,admin));
			repository.save(new Employee("Steve",12000,admin));

			repository.save(new Employee("Scott",15000,development));
			repository.save(new Employee("James",18000,development));
			repository.save(new Employee("Kevin",17000,development));

		}

		System.out.println("Criteria Query Result");

		service.getEmployees(7000,"Payroll")
				.forEach(System.out::println);

	}
}