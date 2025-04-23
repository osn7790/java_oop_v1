package com.startcraft_v04;

public class Zergling extends Unit {

    // 생성자
    public Zergling(String name) { // 강제 입력은 이름만이고 나머지들 기본값 지정가능.
        this.name = name;
        this.power = 3;
        this.hp = 50;
    }

}
