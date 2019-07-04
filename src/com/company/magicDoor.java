package com.company;

public class magicDoor {


    public Hero[] generateHeroes() {
        Hero[] herArr = new Hero[4];
        Hero h1 = new Hero(300, 100, 50);
        herArr[1] = h1;
        herArr[2] = h1;
        herArr[3] = h1;
        herArr[4] = h1;
        return herArr;
    }
}

