package com.company;

public class Hero {
    int health;
    int damage;
    int typeHit;

    public Hero(int Health, int damage, int typeHit) {
        this.health = health;
        this.damage = damage;
        this.typeHit = typeHit;
    }

        public String printInfo () {
            return health + "" + damage + "" + typeHit;
        }
    }

