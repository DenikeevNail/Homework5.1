package com.company;

import java.util.Random;

public class Boss {
    private int health;
    private int damage;
    private int defence;
    public static int [] defences = {1,2,3,4};


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String printInfo() {
        return health + " " + damage + " " + defence;
    }

    public void changeDefence() {
        Random r = new Random();
        int randomNumber = r.nextInt(4);
        defences[0] = defences [randomNumber];
    }
}

