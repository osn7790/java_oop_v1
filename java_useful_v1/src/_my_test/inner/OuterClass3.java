package _my_test.inner;

/**
 * 익명 내부 클래스란?
 * 익명(익명이란? 이름이 없다)
 */

public class OuterClass3 {

    public OuterClass3() {

        new Runnable() {
            @Override
            public void run() {

            }
        };
    }

    public static void main(String[] args) {
        new OuterClass();
    }


}
