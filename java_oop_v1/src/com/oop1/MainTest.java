package com.oop1;

public class MainTest {

    public static void main(String[] args) {

        Student s1 = new Student("티모", 10_000);
        Bus bus1 = new Bus(100);
        Bus bus2 = new Bus(133);
        FryStore o1 = new FryStore(0,0,2);

        s1.takeBus(bus2);

        s1.showInfo();
        System.out.println("===================");
        bus2.showInfo();
        s1.eatFry(o1);
        s1.eatFry(o1);
        o1.showInfo();
        s1.showInfo();
        s1.eatFry(o1);
        s1.eatFry(o1);
        s1.eatFry(o1);
        s1.eatFry(o1);
        s1.eatFry(o1);


    }
}
