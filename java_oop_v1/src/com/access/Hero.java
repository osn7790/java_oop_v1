package com.access;

public class Hero {

    private String name;
    private int hp;
    private int power;
    private double defense;
    private boolean isDie;

    // getter 5개 만들어 주세요

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    public double getDefense() {
        return defense;
    }

    public boolean getisDie() {
        return isDie;
    }

    // setter 5개 만들어주세요

    public void setName(String n) {
        name = n;
    }

    public void setHp(int h) {
        hp = h;
    }

    public void setPower(int p) {
        power = p;
    }

    public void setDefense(int d) {
        defense = d;
    }

    public void setisDie(boolean i) {
        isDie = i;
    }


}
