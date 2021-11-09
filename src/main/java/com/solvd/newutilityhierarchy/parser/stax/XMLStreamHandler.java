package com.solvd.newutilityhierarchy.parser.stax;

import com.solvd.newutilityhierarchy.parser.*;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class XMLStreamHandler {

    public Organization processXMLFile(File xmlFile) throws FileNotFoundException, XMLStreamException {
        Organization organization = null;
        Director director = null;
        Employee employee = null;
        Service service = null;
        Material material = null;
        //String name = null;
        //boolean isOrganizationFlag;
        boolean isDirFlag = false;
        //boolean isEmplFlag = false;


        XMLStreamReader xmlStreamReader = (XMLInputFactory.newInstance()).createXMLStreamReader(new FileInputStream(xmlFile));
        while (xmlStreamReader.hasNext()) {
            switch (xmlStreamReader.next()) {
                case XMLStreamConstants.START_ELEMENT:
                    if (xmlStreamReader.getLocalName().equals("organization")) {
                        organization = new Organization();
                        organization.setName(xmlStreamReader.getAttributeValue(0));
/*                      organization.setAddress(xmlStreamReader.getText());*/

/*                    } else if (xmlStreamReader.getLocalName().equals("name")) {
                        name = new String();
                        name.*/

                    } else if (xmlStreamReader.getLocalName().equals("address")) {
                        organization.setAddress(xmlStreamReader.getElementText());

                    } else if (xmlStreamReader.getLocalName().equals("director")) {
                        director = new Director();
                        //director.setHeadName(xmlStreamReader.getText());
                        organization.setDirector(director);
                        //organization.setDirector(xmlStreamReader.get);
                        isDirFlag = true;

                    } else if (xmlStreamReader.getLocalName().equals("employee")) { //ХЗ ЧТО ДЕЛАТЬ С EmployeeS ???
                        employee = new Employee();
/*                      employee.setDob();
                        employee.setPosition();
                        employee.setSalary();*/
                        organization.addEmployee(employee);
                        //isEmplFlag = true;
                        isDirFlag = false;
                    } else if (xmlStreamReader.getLocalName().equals("service")) {
                        service = new Service();
                        //service.setPrice();
                        //service.setDoTime();
                        organization.addService(service);
                        //isEmplFlag = false;
                        isDirFlag = false;
                    }else if (xmlStreamReader.getLocalName().equals("material")) {
                        material = new Material();
                        organization.addMaterial(material);
                        //isEmplFlag = false;
                        isDirFlag = false;
                    } else if (xmlStreamReader.getLocalName().equals("serviceName")) {
                        service.setServiceName(xmlStreamReader.getElementText());
                    } else if (xmlStreamReader.getLocalName().equals("firstName")) {
                        employee.setFirstName(xmlStreamReader.getElementText());
                    } else if (xmlStreamReader.getLocalName().equals("lastName")) {
                        employee.setLastName(xmlStreamReader.getElementText());
                    }

                    break;
                case XMLStreamConstants.CHARACTERS:
                    if (!xmlStreamReader.isWhiteSpace()) {
                        if (isDirFlag) director.setHeadName(xmlStreamReader.getText());
                    }
                    break;

            }
        }
        return organization;
    }

}

