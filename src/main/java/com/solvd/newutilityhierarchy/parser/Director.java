package com.solvd.newutilityhierarchy.parser;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "director")
public class Director {

    @XmlElement(name = "headName")
    private String headName;

    public Director() {
    }

    public Director(String headName) {
        this.headName = headName;
    }

    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }

    @Override
    public String toString() {
        return headName;
    }
}
