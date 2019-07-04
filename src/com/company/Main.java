package com.company;

public class Main {

    public static void main(String[] args) {

        Hero Mental = new Hero(500,100, 30);
        Hero warrior = new Hero(500,120, 40);
        Hero Magic = new Hero(500,80, 50);
        Hero Kinetic = new Hero(500,90, 60);

        Boss boss1 = new Boss();
        boss1.setDamage(100);
        boss1.setDefence(50);
        boss1.setHealth(700);
        System.out.println(boss1.printInfo());



    }
}
