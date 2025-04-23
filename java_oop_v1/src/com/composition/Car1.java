package com.composition;

public class Car1 {

    String name;
    int price;
    Engine1 engine1;

    public Car1() {
        Engine1 engine1 = new Engine1();
    }

    void startCar() {
        engine1.start();
        System.out.println("자동차가 출발합니다.");
    }

    void stopCar() {
        engine1.stop();
        System.out.println("자동차가 멈춥니다.");
    }



}
