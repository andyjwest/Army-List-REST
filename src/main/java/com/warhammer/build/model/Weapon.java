package com.warhammer.build.model;

import com.warhammer.build.SpecialRuleEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by awest on 12/2/14.
 */
public class Weapon {
    private Integer strength;
    private Integer strengthBonus;
    private List<SpecialRuleEnum> specialRuleEnums = new ArrayList<SpecialRuleEnum>();

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getStrengthBonus() {
        return strengthBonus;
    }

    public void setStrengthBonus(Integer strengthBonus) {
        this.strengthBonus = strengthBonus;
    }

    public List<SpecialRuleEnum> getSpecialRuleEnums() {
        return specialRuleEnums;
    }

    public void setSpecialRuleEnums(List<SpecialRuleEnum> specialRuleEnums) {
        this.specialRuleEnums = specialRuleEnums;
    }
}
