package com.solvd.newutilityhierarchy.parser;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {

    @XmlElement(name = "firstName")
    private String firstName;
    @XmlElement(name = "lastName")
    private String lastName;
    @XmlJavaTypeAdapter(DateAdapter.class)
    private LocalDateTime dob;
    @XmlElement(name = "position")
    private String position;
    @XmlElement(name = "salary")
    private int salary;

    public Employee() {
    }

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

