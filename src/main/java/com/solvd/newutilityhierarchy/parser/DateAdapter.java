package com.solvd.newutilityhierarchy.parser;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class DateAdapter extends XmlAdapter<String, LocalDateTime> {

/*    private static final ThreadLocal<DateFormat> dateFormat
            = new ThreadLocal<DateFormat>() {*/

/*        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };*/

    @Override
    public LocalDateTime unmarshal(String xmlDate) throws Exception {
        return LocalDateTime.parse(xmlDate);
    }

    @Override
    public String marshal(LocalDateTime xmlDate) throws Exception {
        return xmlDate.toString();
    }
}

/*
public class LocalDateTimeAdapter extends XmlAdapter<String, LocalDateTime> {

    @Override
    public LocalDateTime unmarshal(String localDateTimeString) throws Exception {
        return LocalDateTime.parse(localDateTimeString);
    }

    @Override
    public String marshal(LocalDateTime localDateTime) throws Exception {
        return localDateTime.toString();
    }

}*/
