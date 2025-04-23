package com.method;

public class CoffeeMachineMain {

    public static void main(String[] args) {

        // 커피 머신 객체 생성
        CoffeeMachine machine1 = new CoffeeMachine(3000, 600);


        // 재료 채우기 동작을 시켜 보자 (물, 원두)
        machine1.refillWater(1000);
        machine1.refillCoffee(10);
        // 초기값에 채우기로 채워진 값이 더해져 아래 잔량이 나온다.


        System.out.println("----------------");

        machine1.showInfo();

        // 커피 만들기 테스트
        System.out.println("커피 주문!");
        String result = machine1.makeCoffee();
        System.out.println(result);
        System.out.println("================");

        // 또 커피 주문
        System.out.println("또 커피 주문!");
        System.out.println(machine1.makeCoffee());
        System.out.println("================");

        machine1.showInfo();

        // 또 커피 주문 (재료 부족 테스트)
        System.out.println("또 커피 주문!");
        machine1.makeCoffee();
        System.out.println(machine1.makeCoffee());
        System.out.println("================");

    } // end of main

}
