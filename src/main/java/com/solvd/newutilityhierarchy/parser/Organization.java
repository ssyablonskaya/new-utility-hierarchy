package com.solvd.newutilityhierarchy.parser;

import java.util.ArrayList;

public class Organization {

    //public static final Logger LOGGER = LogManager.getLogger(Organization.class);

    private String name = null;
    private String address = null;
    private Director director = null; //????
    private ArrayList<Employee> employees = new ArrayList<Employee>();
    private ArrayList<Service> services = new ArrayList<Service>();
    private ArrayList<Material> materials = new ArrayList<Material>();

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

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addService(Service service) {
        services.add(service);
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }

    public void addMaterial(Material material) {
        materials.add(material);
    }

    public ArrayList<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(ArrayList<Material> materials) {
        this.materials = materials;

    }

}

