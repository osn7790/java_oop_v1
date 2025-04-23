package com.mytest;

import com.dot.B;

public class Baseball {

    private String name;
    private double money;

    public Baseball(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public double setmoney(double x) {
        return this.money = x;
    }

    public void display() {
        System.out.println("구단 : " + name);
    }



}
