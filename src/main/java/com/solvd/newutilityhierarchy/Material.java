package com.solvd.newutilityhierarchy;

public class Material {

    private String name;
    private int price;

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
