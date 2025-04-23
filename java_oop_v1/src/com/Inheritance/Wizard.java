package com.Inheritance;

public class Wizard extends Hero {
    Wizard(String name, int hp) {
        super(name, hp);
    }

    void freezing() {
        System.out.println("상대를 얼렸습니다.");
    }
}
