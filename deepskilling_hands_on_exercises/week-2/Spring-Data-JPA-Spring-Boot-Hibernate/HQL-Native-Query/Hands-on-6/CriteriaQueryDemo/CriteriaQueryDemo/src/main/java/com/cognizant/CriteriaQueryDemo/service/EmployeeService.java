package com.cognizant.CriteriaQueryDemo.service;

import com.cognizant.CriteriaQueryDemo.model.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Employee> getEmployees(double salary, String dept){

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);

        Root<Employee> employee = cq.from(Employee.class);

        Predicate salaryPredicate =
                cb.greaterThan(employee.get("salary"),salary);

        Predicate deptPredicate =
                cb.equal(employee.get("department").get("dpName"),dept);

        cq.select(employee)
                .where(cb.and(salaryPredicate,deptPredicate));

        return entityManager.createQuery(cq).getResultList();

    }

}