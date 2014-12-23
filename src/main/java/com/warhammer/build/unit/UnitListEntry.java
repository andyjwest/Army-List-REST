package com.warhammer.build.unit;

import com.warhammer.build.SpecialRule;
import com.warhammer.build.model.Model;

import java.util.List;

/**
 * Created by Andy on 12/23/2014.
 */
public class UnitListEntry {

    private String name;
    private int minimumModels;
    private Model baseModel;
    private List<SpecialRule> specialRules;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinimumModels() {
        return minimumModels;
    }

    public void setMinimumModels(int minimumModels) {
        this.minimumModels = minimumModels;
    }

    public Model getBaseModel() {
        return baseModel;
    }

    public void setBaseModel(Model baseModel) {
        this.baseModel = baseModel;
    }

    public List<SpecialRule> getSpecialRules() {
        return specialRules;
    }

    public void setSpecialRules(List<SpecialRule> specialRules) {
        this.specialRules = specialRules;
    }
}