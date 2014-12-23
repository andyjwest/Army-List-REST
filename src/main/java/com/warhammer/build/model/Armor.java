package com.warhammer.build.model;

/**
 * Created by awest on 12/2/14.
 */
public class Armor {
    private String name;
    private Integer armorSave;
    private ArmorLocation armorLocation;

    public Integer getArmorSave() {
        return armorSave;
    }

    public void setArmorSave(Integer armorSave) {
        this.armorSave = armorSave;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
