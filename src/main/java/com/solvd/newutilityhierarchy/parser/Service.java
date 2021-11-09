package com.solvd.newutilityhierarchy.parser;

public class Service {

    private String serviceName = null;
    private int price = 0;
    private int doTime = 0;

    public Service() {}

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

}
