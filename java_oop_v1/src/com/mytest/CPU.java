package com.mytest;

public class CPU {

    String type;
    int number;

    public CPU(String type) {
        this.type = type;
    }

    void showInfo() {
        System.out.println( type + "인 CPU 입니다.");
    }


}
