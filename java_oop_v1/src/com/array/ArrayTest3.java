package com.array;

import java.util.Random;

public class ArrayTest3 {

    public static void main(String[] args) {

        // 난수 발생 기능 - 랜덤한 숫자를 하나 만들어 주는 도구
        // 자바 개발자들이 미리 만들어 준 기능
        Random random = new Random();
        //문서 <--- 구글링 <---- AI
        // 0 ~ 44 까지 랜덤한 숫자를 하나 발생해 준다.
        // 1 ~ 45

        // 배열과 for 문을 활용해서 코드를 수정해주세요

        int ranInt1 = random.nextInt(45) + 1;
        int ranInt2 = random.nextInt(45) + 1;
        int ranInt3 = random.nextInt(45) + 1;
        int ranInt4 = random.nextInt(45) + 1;
        int ranInt5 = random.nextInt(45) + 1;
        int ranInt6 = random.nextInt(45) + 1;


        // 위에 코드는 출력하면 하나하나씩 나오니깐
        // 한번에 나오도록 for 문이랑 배열 활용해서 하라는 말.
        // (6개가 한코드로 바로출력이되도록)

        int[] arrayInt = new int[6]; // 6칸에 순서대로 들어간다.


        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = random.nextInt(45) + 1;
            System.out.println(arrayInt[i]);
        }

    }


}
