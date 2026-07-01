package com.cognizant.springlearn.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.springlearn.model.Department;

@Repository
public class DepartmentDao {

    private static List<Department> DEPARTMENT_LIST;

    public DepartmentDao() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("department.xml");

        DEPARTMENT_LIST = new ArrayList<>();

        DEPARTMENT_LIST.add(context.getBean("dept1", Department.class));
        DEPARTMENT_LIST.add(context.getBean("dept2", Department.class));
        DEPARTMENT_LIST.add(context.getBean("dept3", Department.class));
    }

    public List<Department> getAllDepartments() {
        return DEPARTMENT_LIST;
    }
}