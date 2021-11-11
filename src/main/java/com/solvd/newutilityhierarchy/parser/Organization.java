package com.solvd.newutilityhierarchy.parser;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlRootElement(name = "organization")
@XmlAccessorType(XmlAccessType.FIELD)
public class Organization {

    @XmlAttribute
    private String name;
    @XmlElement(name = "address")
    private String address;
    @XmlElement(name = "director")
    private Director director;
    @XmlElementWrapper(name = "employees")
    @XmlElement(name = "employee")
    private ArrayList<Employee> employees;
    @XmlElementWrapper(name = "services")
    @XmlElement(name = "service")
    private ArrayList<Service> services;
    @XmlElementWrapper(name = "materials")
    @XmlElement(name = "material")
    private ArrayList<Material> materials;

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

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }

    public ArrayList<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(ArrayList<Material> materials) {
        this.materials = materials;

    }

}

