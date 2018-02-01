package com.test.ciklum;


import com.test.ciklum.inventory.HealthPotion;
import com.test.ciklum.inventory.Item;
import com.test.ciklum.service.ItemActions;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int healthPotionAmount = 0;
        Item[] inventory = ItemActions.itemGenerator(10);
        System.out.println(Arrays.toString(inventory));

        for (Item item : inventory) {
            if (item.getClass().equals(HealthPotion.class)) {
                healthPotionAmount++;
            }
        }

        System.out.println("Quantity of health potions is " + healthPotionAmount);
    }
}