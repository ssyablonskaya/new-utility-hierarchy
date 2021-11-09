package com.solvd.newutilityhierarchy.parser;

public class Director {

    private String headName = null;

    public Director() {}

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
        return "Director name: " + headName + "; ";
    }
}
