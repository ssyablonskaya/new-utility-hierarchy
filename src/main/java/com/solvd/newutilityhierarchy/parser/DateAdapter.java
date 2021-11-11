package com.solvd.newutilityhierarchy.parser;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import java.time.LocalDateTime;

public class DateAdapter extends XmlAdapter<String, LocalDateTime> {

    @Override
    public LocalDateTime unmarshal(String xmlDate) throws Exception {
        return LocalDateTime.parse(xmlDate);
    }

    @Override
    public String marshal(LocalDateTime xmlDate) throws Exception {
        return xmlDate.toString();
    }
}

