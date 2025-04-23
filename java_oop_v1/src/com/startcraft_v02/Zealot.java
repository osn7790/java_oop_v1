package com.startcraft_v02;

/**
 * ver02
 * 메서드 오버로딩 기법을 적용해서 코드를 설계해 보자.
 */

public class Zealot {

    private String name;
    private int power;
    private int hp;


    public Zealot(String name){
        this.name = name;
        this.power = 5;
        this.hp = 80;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    public void attack(Marine marine) {
        System.out.println(name + " 이" + "질럿 1을 공격합니다.");
        marine.beAttacked(this.power);
    }

    public void beAttacked(int power) {
        if (this.hp <= 0) {
            System.out.println(name + "이(가) 이미 사망하였습니다.");
            return;
        }
        this.hp -= power;
        System.out.println(name + "이(가) 공격을 당합니다.");
    }

    public void showInfo() {
        System.out.println("---------⭐상태창⭐---------");
        System.out.println("질럿 이름 : " + name);
        System.out.println("질럿 공격력 : " + power);
        System.out.println("질럿 체력 : " + hp);
    }



}
