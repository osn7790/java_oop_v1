package com._interface;

public class Television extends HomeAppliances implements RemoteController {

    @Override
    public void turnOn() {
        System.out.println("티비 전원을 겹니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("티비 전원을 끕니다");
    }
}
