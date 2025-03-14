package com.hibernate;
import jakarta.persistence.*;

@Entity
@Table(name="xyz")

public class Employee {
    @Id
    private int empId ;
    @Column(name="employee name")
    private String empName ;

    @Transient
    private int age ;

    public int getEmpId() {
        return empId;
    }

    public Employee setEmpId(int empId) {
        this.empId = empId;
        return this;
    }

    public String getEmpName() {
        return empName;
    }

    public Employee setEmpName(String empName) {
        this.empName = empName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Employee setAge(int age) {
        this.age = age;
        return this;
    }
}
