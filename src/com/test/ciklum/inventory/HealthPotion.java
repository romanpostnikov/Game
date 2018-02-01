package com.test.ciklum.inventory;

public class HealthPotion implements Item {
    private String name;
    private int health;

    public HealthPotion(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public HealthPotion(String name) {
        this.name = name;
        this.health = 30;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "HealthPotion{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
