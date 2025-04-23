package com.polymorphism;

import com.dot.A;

/**
 * 하나의 데이터 타입을 다양한 형태로 바라 보는 것 (다형성)
 * 상세히... 한 요소 : 메서드(클래스)가 여러 형태를 가질 수 있는 능력을 의미한다.
 * 상속관계... 다형성을 살펴 보고 있다.
 */

public class AnimalTest1 {

    public static void main(String[] args) {

        Animal aniaml1 = new Animal();
        aniaml1.move();
        aniaml1.eating();
        System.out.println("---------------------");

        // 다형성에 장점
        // 부모 타입으로 자식 클래스를 인스턴스화 할 수 있다.
        Animal animal2 = new Tiger();
        animal2.move();
        animal2.eating();

        // 코드를 작성하는 시점 ---> 컴파일 시점 - 부모(super)클래스에 move가 있는지 확인
        // 프로그램을 실행시키는 시점 ---> 런타임 시점 - heap에 Tiger의 move를 불러옴.(new Tiger 이기때문에)
        System.out.println("---------------------------");
        Animal animal3 = new Human();
        animal3.move();
        animal3.eating();




    } // end of main

}
