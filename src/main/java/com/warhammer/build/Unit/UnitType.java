package com.warhammer.build.unit;

/**
 * Created by awest on 12/18/14.
 */
public enum UnitType {
    LORD("Lord"),
    HERO("Hero"),
    CORE("Core"),
    SPECIAL("Special"),
    RARE ("Rare");

    private final String name;

    UnitType(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
