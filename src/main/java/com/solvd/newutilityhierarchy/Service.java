package com.solvd.newutilityhierarchy;

import java.util.List;

public class Service {

    private String name;
    private int price;
    private int doTime;
    private List<Material> materials;


    public Service(String name, int price, int doTime) {
        this.name = name;
        this.price = price;
        this.doTime = doTime;
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

    public int getDoTime() {
        return doTime;
    }

    public void setDoTime(int doTime) {
        this.doTime = doTime;
    }

    public List<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(List<Material> materials) {
        this.materials = materials;
    }

}
