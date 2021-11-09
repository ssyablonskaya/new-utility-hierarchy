package com.solvd.newutilityhierarchy.parser;

public class Material {

    private String materialName = null;
    private int materialPrice = 0;

    public Material() {}


    public Material(String materialName, int materialPrice, int amount) {
        this.materialName = materialName;
        this.materialPrice = materialPrice;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public int getMaterialPrice() {
        return materialPrice;
    }

    public void setMaterialPrice(int materialPrice) {
        this.materialPrice = materialPrice;
    }


}
