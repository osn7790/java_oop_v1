package com.my;

public class SelfPlay {

    public static void main(String[] args) {

        ExerciseSelf coffeemachine = new ExerciseSelf(5000, 20);

        coffeemachine.showInfo();
        System.out.println("커피 주문");
        coffeemachine.makeCoffee();
        System.out.println("=============");

        coffeemachine.showInfo();
        System.out.println("커피 주문");
        coffeemachine.makeCoffee();
        System.out.println("=============");

        coffeemachine.showInfo();
        System.out.println("커피 주문");
        coffeemachine.makeCoffee();
        System.out.println("=============");


    }

}
