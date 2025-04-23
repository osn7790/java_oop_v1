package com.startcraft_v04;

public class Marine extends Unit {

    // 생성자
    public Marine(String name) { // 강제 입력은 이름만이고 나머지들 기본값 지정가능.
        this.name = name;
        this.power = 4;
        this.hp = 70;
    }

}
