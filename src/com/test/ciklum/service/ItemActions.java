package com.test.ciklum.service;

import com.test.ciklum.inventory.*;

import java.util.Random;

public class ItemActions {
    public static Item[] itemGenerator(int n) {
        Item[] items = new Item[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            items[i] = nextItem(r.nextInt(4));
        }
        return items;
    }

    private static int rand(int min, int max) {
        return (int) (min + Math.random() * (max - min));
    }

    private static Item nextItem(int key) {
        switch (key) {
            case 0:
                return new HealthPotion("Health Potion", rand(20, 100));
            case 1:
                return new ManaPotion("Mana Potion", rand(10, 100));
            case 2:
                return new Armour("Helmet", rand(5, 15));
            case 3:
                return new Weapon("Dagger", rand(5, 40), rand(5, 20));
            default:
                return null;
        }
    }
}
