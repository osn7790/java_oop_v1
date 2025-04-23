package com.my;

public class ExerciseSelf {

    // 커피 머신의 상태 : 물과 커피 원두의양
    int water;
    int coffee;

    // 행위 설계
    // 메서드 1. 물채우기
    public void refillWater(int water) {
        // 방어적 코드 작성 -> 0 밑이면 작동이 안되도록
        if (water > 0) {
            this.water += water;
            System.out.println(water + "ml의 물을 채웠습니다");
        } else {
            System.out.println("0보다 큰 양의 물을 채워주세요");
        }
    }

    // 메서드 2. 커피채우기
    public void refillCoffee(int coffee) {
        if (coffee > 0) {
            this.coffee += coffee;
            System.out.println(coffee + "g의 원두를 채웠습니다");
        } else {
            System.out.println("0보다 큰 양의 원두를 더 넣어주세요.");
        }
    }

    // 메서드 3. 커피내리기 // 물은 100ml , 원두는 20g필요 --> 커피가 완성될떄마다 빠져나감
    public void makeCoffee() {
        if (water >= 100 && coffee >= 20) {
            water -= 100;
            coffee -= 20;
            System.out.println("맛있는 커피가 완성됐습니다.");
        } else {
            System.out.println("물과 원두를 더 채워 당장!");
        }
    }

    public void showInfo() {
        System.out.println("-----현재 잔량 안내------");
        System.out.println("현재 커피 양 : " + coffee);
        System.out.println("현재 물의 양 : " + water);

    }

    public ExerciseSelf(int water, int coffee) {
        this.water = water;
        this.coffee = coffee;
    }

}
