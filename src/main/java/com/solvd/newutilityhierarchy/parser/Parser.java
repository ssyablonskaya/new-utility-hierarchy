package com.solvd.newutilityhierarchy.parser;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public interface Parser {

    Organization parse(String filePath) throws ParserConfigurationException, IOException;

}
