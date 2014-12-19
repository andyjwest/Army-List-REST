package com.warhammer.build.army;

import com.warhammer.build.unit.Unit;

import java.util.List;

/**
 * Created by awest on 12/18/14.
 */
public class Army {
    private Integer id;
    private List<Unit> units;
    private String name;
    private int allowedPoints;
    private ArmyAffiliation armyAffiliation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Unit> getUnits() {
        return units;
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAllowedPoints() {
        return allowedPoints;
    }

    public void setAllowedPoints(int allowedPoints) {
        this.allowedPoints = allowedPoints;
    }

    public ArmyAffiliation getArmyAffiliation() {
        return armyAffiliation;
    }

    public void setArmyAffiliation(ArmyAffiliation armyAffiliation) {
        this.armyAffiliation = armyAffiliation;
    }
}
