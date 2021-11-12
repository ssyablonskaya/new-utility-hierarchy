package com.solvd.newutilityhierarchy.parser;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;
import java.util.List;

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
    @JsonProperty("employee")
    private List<Employee> employees;
    @XmlElementWrapper(name = "services")
    @XmlElement(name = "service")
    @JsonProperty("service")
    private List<Service> services;
    @XmlElementWrapper(name = "materials")
    @XmlElement(name = "material")
    @JsonProperty("material")
    private List<Material> materials;

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

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public List<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(List<Material> materials) {
        this.materials = materials;

    }

}

