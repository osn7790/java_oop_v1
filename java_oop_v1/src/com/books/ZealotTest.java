package com.books;
// 수입 하다 가져 오다.
import com.startcraft_v01.Zealot;

public class ZealotTest {

    public static void main(String[] args) {

        Zealot[] zealots = new Zealot[4];



        // 반복문 사용하지 말고 질럿 3마리만 0, 1, 3 인덱스에 넣어주세요.

        // zealots[0] = New Bus();  <- 안됨. 위에 질럿클래스로 명령

        zealots[0] = new Zealot("질럿1");
        zealots[1] = new Zealot("질럿2");
        zealots[3] = new Zealot("질럿3");

        // 0 번째 인덱스에 주소값을 넣어둔 질럿에 기능을 showInfo()를 호출 하시오
        // zealots[0] - z1.showInf();
        // void라서 리턴값이 없으므로 변수에 저장할 수 없음.
        // 메서드로 만들어뒀기때문에 불러오기만 하면 됨.
        // System.out.println() <-- 넣은 값을 출력함. 근데 void는 값이 없음.
        zealots[0].showInfo();

        // 반복문을 활용해서 배열안에 있는 질럿들에 showInfo()를 호출 하시오

        for(int i = 0; i < zealots.length; i++){
            if(zealots[i] != null) {
                zealots[i].showInfo();
            }

        }


    } // end of main

}
