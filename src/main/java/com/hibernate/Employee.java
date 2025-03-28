package com.hibernate;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Employee {
    @Id
    private int empId ;
    @Column(name="Workers name")
    private String empName ;
    private int age ;
   // @ManyToMany 
    @OneToMany(mappedBy = "emp")
    private List<Insentives> ins ;

    public List<Insentives> getIns() {
        return ins;
    }

    public Employee setIns(List<Insentives> ins) {
        this.ins = ins;
        return this;
    }

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
