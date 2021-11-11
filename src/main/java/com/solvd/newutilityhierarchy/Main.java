package com.solvd.newutilityhierarchy;

import com.solvd.newutilityhierarchy.parser.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Iterator;

public class Main {

    public static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Parser parser = new Jaxb();
        Organization organizationJ = new Organization();
        Employee employeeJ = new Employee();
        Service serviceJ = new Service();
        Material materialJ = new Material();

        try {
            organizationJ = parser.parse("src/main/resources/hierarchy.xml");

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

        } catch (ParserConfigurationException | IOException ex) {
            ex.printStackTrace();
        }
    }

}
