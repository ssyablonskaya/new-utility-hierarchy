package com.solvd.newutilityhierarchy.parser.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.newutilityhierarchy.parser.*;

import java.nio.file.Paths;

public class JSONParser implements Parser {

    public Organization parse(String filePath) {
        Organization organization = new Organization();
        ObjectMapper mapper = new ObjectMapper();

        try {

            organization = mapper.readValue(Paths.get(filePath).toFile(), Organization.class);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return organization;
    }

}

