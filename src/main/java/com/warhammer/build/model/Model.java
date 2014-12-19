package com.warhammer.build.model;

import com.warhammer.build.Army.ArmyAffiliation;
import com.warhammer.build.SpecialRuleEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by awest on 12/2/14.
 */
public class Model {

    private String name;
    private ArmyAffiliation armyAffiliation;
    private int movement;
    private int weaponSkill;
    private int ballisticSkill;
    private int strength;
    private int toughness;
    private int wounds;
    private int initiative;
    private int attacks;
    private int leadership;
    private Integer wardSave = 7;
    private Weapon weapon;
    private List<Armor> armors = new ArrayList<Armor>();
    private List<SpecialRuleEnum> specialRuleEnums = new ArrayList<SpecialRuleEnum>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArmyAffiliation getArmyAffiliation() {
        return armyAffiliation;
    }

    public void setArmyAffiliation(ArmyAffiliation armyAffiliation) {
        this.armyAffiliation = armyAffiliation;
    }

    public int getMovement() {
        return movement;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }

    public int getWeaponSkill() {
        return weaponSkill;
    }

    public void setWeaponSkill(int weaponSkill) {
        this.weaponSkill = weaponSkill;
    }

    public int getBallisticSkill() {
        return ballisticSkill;
    }

    public void setBallisticSkill(int ballisticSkill) {
        this.ballisticSkill = ballisticSkill;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public int getWounds() {
        return wounds;
    }

    public void setWounds(int wounds) {
        this.wounds = wounds;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getAttacks() {
        return attacks;
    }

    public void setAttacks(int attacks) {
        this.attacks = attacks;
    }

    public int getLeadership() {
        return leadership;
    }

    public void setLeadership(int leadership) {
        this.leadership = leadership;
    }

    public Integer getWardSave() {
        return wardSave;
    }

    public void setWardSave(Integer wardSave) {
        this.wardSave = wardSave;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public List<Armor> getArmors() {
        return armors;
    }

    public void setArmors(List<Armor> armors) {
        this.armors = armors;
    }

    public List<SpecialRuleEnum> getSpecialRuleEnums() {
        return specialRuleEnums;
    }

    public void setSpecialRuleEnums(List<SpecialRuleEnum> specialRuleEnums) {
        this.specialRuleEnums = specialRuleEnums;
    }
}
