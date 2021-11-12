package com.solvd.newutilityhierarchy.parser;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Service {

    @XmlElement(name = "serviceName")
    private String serviceName;
    @XmlElement(name = "price")
    private int price;
    @XmlElement(name = "doTime")
    private int doTime;
    @XmlAttribute
    @JsonIgnore
    private String type;

    public Service() {
    }

    public Service(String serviceName, int price, int doTime) {
        this.serviceName = serviceName;
        this.price = price;
        this.doTime = doTime;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDoTime() {
        return doTime;
    }

    public void setDoTime(int doTime) {
        this.doTime = doTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
