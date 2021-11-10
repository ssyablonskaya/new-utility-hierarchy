package com.solvd.newutilityhierarchy.parser;

public class Material {

    private String materialName;
    private int materialPrice;

    public Material() {
    }

    public Material(String materialName, int materialPrice) {
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
