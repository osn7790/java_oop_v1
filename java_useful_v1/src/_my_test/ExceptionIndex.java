package _my_test;

import java.util.Scanner;

public class ExceptionIndex {

    public static void main(String[] args) {

        int[] array = new int[3];
        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("인덱스를 입력해 주세요 : ");
                i = scanner.nextInt();
                System.out.println("인덱스 값 : " + array[i]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("잘못된 인덱스 입니다.");
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다." + e.getMessage());
            } finally {
                scanner.close();
                System.out.println("프로그램을 종료합니다.");
            }





    }

}
