package com.test.ciklum.inventory;

public class ManaPotion implements Item {
    private String name;
    private int mana;

    public ManaPotion(String name, int mana) {
        this.name = name;
        this.mana = mana;
    }

    public ManaPotion(String name) {
        this.name = name;
        this.mana = 30;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "\nManaPotion{" +
                "name='" + name + '\'' +
                ", mana=" + mana +
                '}';
    }
}
