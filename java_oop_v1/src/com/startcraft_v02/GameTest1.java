package com.startcraft_v02;

import java.util.Scanner;

/**
 * 메서드 오버로딩이 적용된 코드를 실행시켜 보자.
 */

public class GameTest1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Zealot zealot1 = new Zealot("질럿 1");
        Marine marine1 = new Marine("마린 1");
        Zergling zergling1 = new Zergling("저글링 1");


        marine1.showInfo();

        zealot1.attack(marine1);
        marine1.attack(zealot1);

        marine1.showInfo();

    }

}
