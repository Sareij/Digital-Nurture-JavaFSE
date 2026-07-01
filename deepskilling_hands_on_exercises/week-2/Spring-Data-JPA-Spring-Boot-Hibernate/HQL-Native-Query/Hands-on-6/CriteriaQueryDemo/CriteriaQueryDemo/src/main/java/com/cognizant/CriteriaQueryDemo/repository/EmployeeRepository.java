package com.cognizant.CriteriaQueryDemo.repository;

import com.cognizant.CriteriaQueryDemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}