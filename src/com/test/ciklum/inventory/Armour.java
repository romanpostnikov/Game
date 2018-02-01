package com.test.ciklum.inventory;

public class Armour implements Item {
    private String name;
    private int protection;

    public Armour(String name, int protection) {
        this.name = name;
        this.protection = protection;
    }

    public Armour(String name) {
        this.name = name;
        this.protection = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    @Override
    public String toString() {
        return "\nArmour{" +
                "name='" + name + '\'' +
                ", protection=" + protection +
                '}';
    }
}
