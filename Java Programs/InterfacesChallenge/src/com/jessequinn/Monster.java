package com.jessequinn;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String monsterName;
    private int hitPoints;
    private int strength;

    public Monster(String monsterName, int hitPoints, int strength) {
        this.monsterName = monsterName;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getMonsterName() {
        return this.monsterName;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    public int getStrength() {
        return this.strength;
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<>();
        values.add(0, this.monsterName);
        values.add(1, Integer.toString(this.hitPoints));
        values.add(2, Integer.toString(this.strength));
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0) {
            this.monsterName = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }

    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + this.monsterName + '\'' +
                ", hitPoints=" + this.hitPoints +
                ", strength=" + this.strength +
                '}';
    }
}