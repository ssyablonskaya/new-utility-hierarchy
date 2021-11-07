package com.solvd.newutilityhierarchy;

import java.util.List;
import java.util.Set;

public class Organization {

    private String name;
    private String address;
    private Director director;
    private List<Employee> employees;
    private Set<Service> services;

    public Organization(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployee(List<Employee> employees) {
        this.employees = employees;
    }

    public Set<Service> getService() {
        return services;
    }

    public void setService(Set<Service> service) {
        this.services = service;
    }

}

