package com.solvd.newutilityhierarchy.parser;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;

public interface Parser {

    Organization parse(String filePath) throws ParserConfigurationException, IOException, XMLStreamException;

}
