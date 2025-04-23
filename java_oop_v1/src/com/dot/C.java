package com.dot;

public class C {

    // 기본 생성자 호출 됨 ---> heap 메모리에 c 객체가 올라 갔다.

    public void callFinal() {
        System.out.println("callFinal() 메소드가 호출되었다.");
    }

    public void callC( ) {
        System.out.println("난 여기서 멈출래");
    }

}
