package com.test.ciklum.inventory;

public class Weapon implements Item {
    private String name;
    private int damage;
    private int speed;

    public Weapon(String name, int damage, int speed) {
        this.name = name;
        this.damage = damage;
        this.speed = speed;
    }

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
        this.speed = 5;
    }

    public Weapon(String name) {
        this.name = name;
        this.damage = 10;
        this.speed = 5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", speed=" + speed +
                '}';
    }
}
