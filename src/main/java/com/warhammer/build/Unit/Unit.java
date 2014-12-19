package com.warhammer.build.unit;

import com.warhammer.build.army.ArmyAffiliation;
import com.warhammer.build.model.Model;

import java.util.List;

/**
 * Created by awest on 12/5/14.
 */
public class Unit {
    private List<Model> models;
    private String name;
    private Model champion;
    private Model standardBearer;
    private Model musician;
    private ArmyAffiliation affiliation;
    private UnitType unitType;
    private Integer id;

    public List<Model> getModels() {
        return models;
    }

    public void setModels(List<Model> models) {
        this.models = models;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Model getChampion() {
        return champion;
    }

    public void setChampion(Model champion) {
        this.champion = champion;
    }

    public Model getStandardBearer() {
        return standardBearer;
    }

    public void setStandardBearer(Model standardBearer) {
        this.standardBearer = standardBearer;
    }

    public Model getMusician() {
        return musician;
    }

    public void setMusician(Model musician) {
        this.musician = musician;
    }

    public ArmyAffiliation getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(ArmyAffiliation affiliation) {
        this.affiliation = affiliation;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    public void setUnitType(UnitType unitType) {
        this.unitType = unitType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
