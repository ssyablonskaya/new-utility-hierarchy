package com.solvd.newutilityhierarchy.parser;

public class Material {

    private String name = null;
    private int price = 0;

    public Material() {}

    public Material(String name, int price, int amount) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
