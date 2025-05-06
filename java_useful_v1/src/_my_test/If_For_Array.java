package _my_test;

import java.util.Scanner;

public class If_For_Array {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num[] = new int[8];
        String score[] = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};

        System.out.println("정수를 입력하세요 : ");
        for (int i = 0; i < num.length; i++) {
            int x = scanner.nextInt();
            num[i] = i + 1;
            if (num[i] > 0 && num[i] < 7) {
                System.out.println(score[i]);
            } else {
                System.out.println("OTHER");
            }

        }
    }

    }
