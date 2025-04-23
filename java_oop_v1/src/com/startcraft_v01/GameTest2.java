package com.startcraft_v01;

import java.util.Scanner;

public class GameTest2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Zealot zealot1 = new Zealot("강화 질럿");
        Zergling zergling1 = new Zergling("발업 저글링");
        Marine marine1 = new Marine("영웅 마린");

        boolean flag = true;
        while (flag) {
            System.out.println("1.질럿 2.마린 3.저글링 을 선택해주세요  0. 종료");
            int selected = scanner.nextInt();
            if (selected == 1) {
                System.out.println("질럿을 선택하셨습니다. 누구를 공격하시겠습니까? 1. 마린 2. 저글링 3. 홈");
                while (flag) {
                    int choice = scanner.nextInt();
                    if (choice == 1) {
                        zealot1.attackMarine(marine1);
                        if (marine1.getHp() <= 0) {
                            System.out.println("체력이 0 이므로 종료합니다.");
                            flag = false;
                            return;

                        }
                    } else if (choice == 2) {
                        zealot1.attackZergling(zergling1);
                        if (zergling1.getHp() <= 0) {
                            System.out.println("체력이 0 이므로 종료합니다.");
                            flag = false;
                        }
                    } else if (choice == 3) {
                        System.out.println("홈화면으로 돌아갑니다.");
                        break;
                    }
                }
            } else if (selected == 2) {
                System.out.println("마린을 선택하셨습니다. 누구를 공격하시겠습니까? 1. 질럿 2. 마린");
                int choice2 = scanner.nextInt();
                if (choice2 == 1) {
                    marine1.attackZealot(zealot1);
                } else {
                    zealot1.attackMarine(marine1);
                }
            } else if (selected == 3) {
                System.out.println("저글링을 선택하셨습니다. 누구를 공격하시겠습니까? 1. 질럿 2. 마린");
                int choice3 = scanner.nextInt();
                if (choice3 == 1) {
                    zergling1.attackZealot(zealot1);
                } else {
                    zergling1.attackMarine(marine1);
                }
            } else if (selected == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }


    }

}
