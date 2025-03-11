package com.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
public class Student {
    String Name;

    @Id
    int RollNo;
    double Marks;
    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", RollNo=" + RollNo +
                ", Marks=" + Marks +
                '}';
    }
    public String getName() {
        return Name;
    }

    public Student setName(String name) {
        Name = name;
        return this;
    }

    public double getMarks() {
        return Marks;
    }

    public Student setMarks(double marks) {
        Marks = marks;
        return this;
    }

    public int getRollNo() {
        return RollNo;
    }

    public Student setRollNo(int rollNo) {
        RollNo = rollNo;
        return this;
    }
}
