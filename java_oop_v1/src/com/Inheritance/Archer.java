package com.Inheritance;

public class Archer extends Hero {

    public Archer(String name, int hp) {
        super(name, hp);
    }

    void fireArrow() {
        System.out.println("불화살을 사용했습니다.");
    }
}
