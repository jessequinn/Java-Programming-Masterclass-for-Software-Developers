package com.jessequinn;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String playerName;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String playerName, int hitPoints, int strength) {
        this.playerName = playerName;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Katana";
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void setName(String playerName) {
        this.playerName = playerName;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player {" +
                "name='" + this.playerName + '\'' +
                ", hitPoints=" + this.hitPoints +
                ", strength=" + this.strength +
                ", weapon='" + this.weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.playerName);
        values.add(1, Integer.toString(this.hitPoints));
        values.add(2, Integer.toString(this.strength));
        values.add(3, this.weapon);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.playerName = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }

    }
}