package com.solvd.newutilityhierarchy.parser;

import java.time.LocalDateTime;

public class Employee {

    private String firstName = null;
    private String lastName = null;
    private LocalDateTime dob = null;
    private String position = null;
    private int salary = 0;

    public Employee() {}

    public Employee(String firstName, String lastName, LocalDateTime dob, String position, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.position = position;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public void setDob(LocalDateTime dob) {
        this.dob = dob;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}

