package com.solvd.newutilityhierarchy.parser.stax;

import com.solvd.newutilityhierarchy.parser.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;

public class XMLStreamDriver {

    public static final Logger LOGGER = LogManager.getLogger(XMLStreamDriver.class);

    public static void main(String[] args) throws XMLStreamException, FileNotFoundException {
        displayOrganization((new XMLStreamHandler())
                .processXMLFile(new File("src/main/resources/hierarchy.xml")));

        System.out.println();

    }

    private static void displayOrganization(Organization organization) { //МБ это тут нужен метод парс
        //String address = null;
        Employee employee = null;
        Service service = null;
        Material material = null;
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
            LOGGER.debug("service name: " + service.getServiceName() + " | price: "
                    + service.getPrice() + " | time to do job: " + service.getDoTime() + " hours;");

        }
        Iterator<Material> materialIterator = organization.getMaterials().iterator();
        while (materialIterator.hasNext()) {
            material = materialIterator.next();
            LOGGER.debug("material name: " + material.getName() + " | price: "
                    + material.getPrice() + " rubles;");

        }

    }

}
