package com.mytest;

import com.dot.B;

public class PlayBaseball {

    public static void main(String[] args) {

        Baseball Lotte = new Baseball("롯데" , 1.5);
        Baseball Nc = new Baseball("NC", 4.5);

        BaseballPlayer player1 = new BaseballPlayer("김파울", 6);
        BaseballPlayer player2 = new BaseballPlayer("왕홈런", 7);


        player1.showInfo();
        player1.employed(Lotte);
        player1.showInfo();
        player2.employed(Nc);
        player1.baseball.setmoney(0.9);
        player1.showInfo();

    }

}
