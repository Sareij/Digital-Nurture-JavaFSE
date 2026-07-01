package com.cognizant.ormlearn.model;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @Column(name="em_id")
    private int id;

    @Column(name="em_name")
    private String name;

    @Column(name="em_salary")
    private double salary;

    @ManyToOne
    @JoinColumn(name="dp_id")
    private Department department;

    public Employee() {
    }

    public Employee(int id, String name, double salary, Department department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id +
                ", name=" + name +
                ", salary=" + salary +
                ", department=" + department.getName() +
                "]";
    }
}