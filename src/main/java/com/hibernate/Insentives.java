package com.hibernate;

import jakarta.persistence.*;

@Entity
public class Insentives
{
    @Id
    private int insId ;
    private String Car ;
    private String House ;

    @ManyToOne
    private Employee emp ;

    public Employee getEmp() {
        return emp;
    }

    public Insentives setEmp(Employee emp) {
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
