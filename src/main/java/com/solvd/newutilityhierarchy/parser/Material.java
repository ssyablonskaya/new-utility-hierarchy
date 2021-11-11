package com.solvd.newutilityhierarchy.parser;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Material {

    @XmlElement(name = "materialName")
    private String materialName;
    @XmlElement(name = "materialPrice")
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
