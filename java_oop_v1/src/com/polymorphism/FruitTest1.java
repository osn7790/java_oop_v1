package com.polymorphism;

public class FruitTest1 {

    public static void main(String[] args) {

        Fruit fruit1 = new Banana(); // 업캐스팅된 상태
        Fruit fruit2 = new Peach(); // 업캐스팅된 상태
        fruit1.showInfo();
        System.out.println("---------------------------");
        fruit2.showInfo();

        // 사전기반지식 - 컴파일, 런타임
        // 위 상황에서 바나나의 원산지 정보를 출력하시오..
        // 업캐스팅된 상태 : 컴파일 시점에 부모에 있는 변수나 메서드만 확인을 할 수 있다.
        // 타입 변수 = ((강제캐스팅할클래스)객체명).자식클래스변수; -> 부모클래스에서 자식 멤버변수를 부를수있음.
        String resultOrigin = ((Banana) fruit1).origin; // 다운 캐스팅
        System.out.println("바나나 원산지 : " + resultOrigin);

        // 키워드 - 인스턴스오브 연산자를 알아보자.
        // instanceof --> 예약어.
        if (fruit1 instanceof Peach) {
            System.out.println("여기 들어 올까? 1");
        }

        if (fruit1 instanceof Banana) {
            System.out.println("여기 들어 올까? 2");
        }

        // 도전 문제
        // fruit1에 saleBanana() 메서드를 호출 하시오.

        ((Banana) fruit1).saleBanana();
        fruit1.showInfo();


    } // end of main

}
