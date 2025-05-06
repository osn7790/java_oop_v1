package _my_test;

public class ExceptionEx {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        try {
            for (int i = 0; i < 10; i++)
                System.out.println("arr[" + i + "] = " + arr[i]);
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("배열에 범위를 넘었어요!");
        } catch (Exception e) {
            System.out.println(e.getClass());
        }

        System.out.println("비정상 종료되지 않았습니다");

    }


}
