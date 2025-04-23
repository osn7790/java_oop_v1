package com._abstract;

public class DeskTop extends Computer{

    @Override
    public void display() {
        System.out.println("데스크탑 화면을 킵니다.");
    }

    @Override
    public void typing() {
        System.out.println("데스크탑으로 타이핑을 칩니다.");
    }
}
