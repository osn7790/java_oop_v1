package com.dot;

public class B {

    C c;

    public B() {
        System.out.println("난 B! C에 있는 Final을 불러보자");
        // 무언가 코드를 작성해야 해!
        c = new C();
    }

    public void callB( ) {
        System.out.println("난 여기서 멈출래");
    }


}
