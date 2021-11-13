package com.solvd.newutilityhierarchy;

import com.solvd.newutilityhierarchy.parser.*;
import com.solvd.newutilityhierarchy.parser.jaxb.Jaxb;
import com.solvd.newutilityhierarchy.parser.json.JSONParser;
import com.solvd.newutilityhierarchy.parser.stax.XMLStreamParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.Iterator;

public class Main {

    public static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        LOGGER.info("StAX parser:");
        System.out.println();

        Parser parser = new XMLStreamParser();
        Organization organization = new Organization();
        Employee employee = new Employee();
        Service service = new Service();
        Material material = new Material();

        try {
            organization = parser.parse("src/main/resources/hierarchy.xml");

            LOGGER.debug("Organization name: " + organization.getName() + ";");
            LOGGER.debug("Address: " + organization.getAddress());
            LOGGER.debug("Director name: " + organization.getDirector());
            Iterator<Employee> employeeIterator = organization.getEmployees().iterator();
            while (employeeIterator.hasNext()) {
                employee = employeeIterator.next();
                LOGGER.debug("employee firstName: " + employee.getFirstName() + " | lastName: "
                        + employee.getLastName() + " | dob: " + employee.getDob() + " | position: "
                        + employee.getPosition() + " | salary: " + employee.getSalary() + ";");
            }

            Iterator<Service> serviceIterator = organization.getServices().iterator();
            while (serviceIterator.hasNext()) {
                service = serviceIterator.next();
                LOGGER.debug("service name: " + service.getServiceName() + " {type: " + service.getType() + "} | price: "
                        + service.getPrice() + " | time to do job: " + service.getDoTime() + " hours;");
            }

            Iterator<Material> materialIterator = organization.getMaterials().iterator();
            while (materialIterator.hasNext()) {
                material = materialIterator.next();
                LOGGER.debug("material name: " + material.getMaterialName() + " | price: "
                        + material.getMaterialPrice() + " rubles;");
            }
        } catch (ParserConfigurationException | IOException | XMLStreamException ex) {
            ex.printStackTrace();
        }

        System.out.println();
        System.out.println();
        LOGGER.info("Jaxb parser:");
        System.out.println();

        Parser parserJ = new Jaxb();
        Organization organizationJ = new Organization();
        Employee employeeJ = new Employee();
        Service serviceJ = new Service();
        Material materialJ = new Material();

        try {
            organizationJ = parserJ.parse("src/main/resources/hierarchy.xml");

            LOGGER.debug("Organization's name: " + organizationJ.getName() + ";");
            LOGGER.debug("Address: " + organizationJ.getAddress() + ";");
            LOGGER.debug("Director's name: " + organizationJ.getDirector() + ";");

            Iterator<Employee> employeeJIterator = organizationJ.getEmployees().iterator();
            while (employeeJIterator.hasNext()) {
                employeeJ = employeeJIterator.next();
                LOGGER.debug("employee firstName: " + employeeJ.getFirstName() + " | lastName: "
                        + employeeJ.getLastName() + " | dob: " + employeeJ.getDob().getDayOfMonth() + "."
                        + employeeJ.getDob().getMonthValue() + "." + employeeJ.getDob().getYear() + " | position: "
                        + employeeJ.getPosition() + " | salary: " + employeeJ.getSalary() + " rubles;");
            }

            Iterator<Service> serviceJIterator = organizationJ.getServices().iterator();
            while (serviceJIterator.hasNext()) {
                serviceJ = serviceJIterator.next();
                LOGGER.debug("service name: " + serviceJ.getServiceName() + " {type: " + serviceJ.getType() + "} | price: "
                        + serviceJ.getPrice() + " | time to do job: " + serviceJ.getDoTime() + " hours;");
            }

            Iterator<Material> materialIteratorJ = organizationJ.getMaterials().iterator();
            while (materialIteratorJ.hasNext()) {
                materialJ = materialIteratorJ.next();
                LOGGER.debug("material name: " + materialJ.getMaterialName() + " | price: "
                        + materialJ.getMaterialPrice() + " rubles;");
            }

        } catch (ParserConfigurationException | IOException | XMLStreamException ex) {
            ex.printStackTrace();
        }

        System.out.println();
        System.out.println();
        LOGGER.info("JSON parser:");
        System.out.println();

        Parser parserJSON = new JSONParser();
        Organization organizationJSON = new Organization();
        Employee employeeJSON = new Employee();
        Service serviceJSON = new Service();
        Material materialJSON = new Material();

        try {
            organizationJSON = parserJSON.parse("src/main/resources/hierarchy.json");

            LOGGER.debug("Organization's name: " + organizationJSON.getName() + ";");
            LOGGER.debug("Address: " + organizationJSON.getAddress() + ";");
            LOGGER.debug("Director's name: " + organizationJSON.getDirector() + ";");

            Iterator<Employee> employeeJSONIterator = organizationJSON.getEmployees().iterator();
            while (employeeJSONIterator.hasNext()) {
                employeeJSON = employeeJSONIterator.next();
                LOGGER.debug("employee firstName: " + employeeJSON.getFirstName() + " | lastName: "
                        + employeeJSON.getLastName() + " | dob: " + employeeJSON.getDob().getDayOfMonth() + "."
                        + employeeJSON.getDob().getMonthValue() + "." + employeeJSON.getDob().getYear() + " | position: "
                        + employeeJSON.getPosition() + " | salary: " + employeeJSON.getSalary() + " rubles;");
            }

            Iterator<Service> serviceJSONIterator = organizationJSON.getServices().iterator();
            while (serviceJSONIterator.hasNext()) {
                serviceJSON = serviceJSONIterator.next();
                LOGGER.debug("service name: " + serviceJSON.getServiceName() + " | price: "
                        + serviceJSON.getPrice() + " | time to do job: " + serviceJSON.getDoTime() + " hours;");
            }

            Iterator<Material> materialJSONIterator = organizationJSON.getMaterials().iterator();
            while (materialJSONIterator.hasNext()) {
                materialJSON = materialJSONIterator.next();
                LOGGER.debug("material name: " + materialJSON.getMaterialName() + " | price: "
                        + materialJSON.getMaterialPrice() + " rubles;");
            }

        } catch (ParserConfigurationException | IOException | XMLStreamException ex) {
            ex.printStackTrace();
        }

    }
}
