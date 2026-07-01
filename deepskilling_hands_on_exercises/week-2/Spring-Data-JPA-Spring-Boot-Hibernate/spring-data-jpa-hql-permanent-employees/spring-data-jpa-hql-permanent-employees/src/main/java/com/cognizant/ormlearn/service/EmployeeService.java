package com.cognizant.ormlearn.service;

import java.util.List;

import com.cognizant.ormlearn.model.Employee;

public interface EmployeeService {

    List<Employee> getAllPermanentEmployees();

    Employee getEmployee(int id);

}