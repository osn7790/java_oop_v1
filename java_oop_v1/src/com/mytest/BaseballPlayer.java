package com.mytest;

public class BaseballPlayer {

    private String name;
    private int num;
    Baseball baseball;


    public BaseballPlayer (String name, int num) {
        this.name = name;
        this.num = num;
        name = null;
    }

    // 소속되다.
    public void employed (Baseball baseball) {
        this.baseball = baseball;
        System.out.println(name + "인 " + num +"번 선수가 " + baseball.getName()  + "에 속해 있습니다." );
    }

    public void showInfo() {
        if (this.baseball != null) {
            System.out.println(name + "이(가) " + this.baseball.getName() + "에서 " + baseball.getMoney() + "억 을 받습니다.");
        } else {
            System.out.println("소속팀이 없습니다.");
        }
    }


}
