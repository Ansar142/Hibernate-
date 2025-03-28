package com.hibernate;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Insentives
{
    @Id
    private int insId ;
    private String Car ;
    private String House ;

    @ManyToMany(mappedBy = "ins")
    private List<Employee> emp ; //List is used for many to many if that was many to one than we cant utilized list

    public List<Employee> getEmp() {
        return emp;
    }

    public Insentives setEmp(List<Employee> emp) {
        this.emp = emp;
        return this;
    }

    public int getInsId() {
        return insId;
    }

    public Insentives setInsId(int insId) {
        this.insId = insId;
        return this;
    }

    public String getCar() {
        return Car;
    }

    public Insentives setCar(String car) {
        Car = car;
        return this;
    }

    public String getHouse() {
        return House;
    }

    public Insentives setHouse(String house) {
        House = house;
        return this;
    }
}
