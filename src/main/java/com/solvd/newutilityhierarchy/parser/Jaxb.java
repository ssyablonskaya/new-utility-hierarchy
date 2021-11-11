package com.solvd.newutilityhierarchy.parser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Jaxb implements Parser {

    public static final Logger LOGGER = LogManager.getLogger(Jaxb.class);

    public Organization parse(String filePath) {

        Organization organizationJ = new Organization();

        try {
            JAXBContext context = JAXBContext.newInstance(Organization.class, Director.class, Employee.class, Service.class, Material.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            organizationJ = (Organization) unmarshaller.unmarshal(new File(filePath));

        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
    return organizationJ;
    }

}
