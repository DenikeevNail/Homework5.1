package com.company;

public class magicDoor {


    public Hero[] generateHeroes() {
        Hero[] herArr = new Hero[4];
        Hero h1 = new Hero(300, 100, 50);
        Hero h2 = new Hero(300, 100, 50);
        Hero h3 = new Hero(300, 100, 50);
        Hero h4 = new Hero(300, 100, 50);
        herArr[1] = h1;
        herArr[2] = h2;
        herArr[3] = h3;
        herArr[4] = h4;
        return herArr;
    }
}

