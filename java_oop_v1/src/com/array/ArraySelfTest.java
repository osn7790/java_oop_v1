package com.array;

public class ArraySelfTest {

    public static void main(String[] args) {

        // 배열은 연관된 데이터타입 통으로 묶어서 관리

        int[] ten = new int[10];

        for (int i = 0; i < ten.length; i++) {
            ten[i] = i + 1;
            System.out.print(ten[i]);
        }

        String[] fruit = new String[4];
        fruit[0] = "사과";


        String[] fruit2 = {"사과", "귤", "포도", "복숭아", "참외"};
        for (int i = 0; i < fruit2.length; i++) {
            System.out.print(fruit2[i]);
        }
        System.out.println("");

        //타입 [] 변수명 = new 타입[] -> 몇칸인지 선언.
        // 그리고 따로 넣어주려면 변수명[인덱스값 - 0부터] = 타입에 따른 값

        double[] money = new double[1];
        money[0] = 3;
        // 아니면
        double[] money2 = {3,5,7,9,11,13};  // <- 바로 변수 값 입력 가능. 배열길이는 6, 인덱스는 0부터 5
        // 숫자아무거나 다 입력가능
        // 초기값입력안해주면 0.0으로 나옴. 글자는 null

        for (int i = 0; i < money2.length; i++) {
            System.out.println(money2[i]);
        }



    }

}
