package com.startcraft_v03;

/**
 * @author 오승운
 */
public class Zealot extends Unit {

    // 생성자
    public Zealot(String name) { // 강제 입력은 이름만이고 나머지들 기본값 지정가능.
        super.name = name;
        super.power = 5;
        super.hp = 80;
    }

}
