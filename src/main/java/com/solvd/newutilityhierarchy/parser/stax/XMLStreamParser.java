package com.solvd.newutilityhierarchy.parser.stax;

import com.solvd.newutilityhierarchy.parser.*;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class XMLStreamParser implements Parser {

    public Organization parse(String filePath) throws FileNotFoundException, XMLStreamException {
        Organization organization = new Organization();
        String tagContent = "";
        Director director = new Director();
        Employee employee = new Employee();
        Service service = new Service();
        Material material = new Material();
        List<Employee> employees = new ArrayList<>();
        List<Service> services = new ArrayList<>();
        List<Material> materials = new ArrayList<>();

        XMLStreamReader xmlStreamReader
                = (XMLInputFactory.newInstance()).createXMLStreamReader(new FileInputStream(filePath));
        while (xmlStreamReader.hasNext()) {
            switch (xmlStreamReader.next()) {
                case XMLStreamConstants.START_ELEMENT:
                    switch (xmlStreamReader.getLocalName()) {
                        case "organization":
                            organization = new Organization();
                            organization.setName(xmlStreamReader.getAttributeValue(0));
                            break;
                        case "address":
                            organization.setAddress(xmlStreamReader.getElementText());
                            break;
                        case "director":
                            director = new Director();
                            organization.setDirector(director);
                            break;
                        case "employee":
                            employee = new Employee();
                            employees.add(employee);
                            organization.setEmployees(employees);
                            break;
                        case "service":
                            service = new Service();
                            services.add(service);
                            organization.setServices(services);
                            service.setType(xmlStreamReader.getAttributeValue(0));
                            break;
                        case "material":
                            material = new Material();
                            materials.add(material);
                            organization.setMaterials(materials);
                            break;
                        default:
                            break;
                    }
                    break;

                case XMLStreamConstants.CHARACTERS:
                    tagContent = xmlStreamReader.getText().trim();
                    break;

                case XMLStreamConstants.END_ELEMENT:
                    switch (xmlStreamReader.getLocalName()) {
                        case "headName":
                            director.setHeadName(tagContent);
                            break;
                        case "firstName":
                            employee.setFirstName(tagContent);
                            break;
                        case "lastName":
                            employee.setLastName(tagContent);
                            break;
                        case "dob":
                            employee.setDob(LocalDateTime.parse(tagContent));
                            break;
                        case "position":
                            employee.setPosition(tagContent);
                            break;
                        case "salary":
                            employee.setSalary(Integer.parseInt(tagContent));
                            break;
                        case "serviceName":
                            service.setServiceName(tagContent);
                            break;
                        case "price":
                            service.setPrice(Integer.parseInt(tagContent));
                            break;
                        case "doTime":
                            service.setDoTime(Integer.parseInt(tagContent));
                            break;
                        case "materialName":
                            material.setMaterialName(tagContent);
                            break;
                        case "materialPrice":
                            material.setMaterialPrice(Integer.parseInt(tagContent));
                            break;
                        default:
                            break;
                    }
                    break;
            }
        }
        return organization;
    }

}

