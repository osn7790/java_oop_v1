package com.startcraft_v01;

/**
 * @author 오승운
 */
public class Zealot {

    private String name;
    private int power;
    private int hp;

    // 생성자
    public Zealot(String name) { // 강제 입력은 이름만이고 나머지들 기본값 지정가능.
        this.name = name;
        this.power = 5;
        this.hp = 80;
    }

    // read only --> getter

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    // setter 는 안만들 예정

    // 질럿이 저글링을 공격하다.
    public void attackZergling(Zergling zergling) {
        System.out.println(name + " 이" + zergling.getName() + " 을 공격합니다");
        zergling.beAttacked(this.power);
    }

    // 질럿이 마린을 공격하다.
    public void attackMarine(Marine marine) {
        System.out.println(name + " 이 " + marine.getName() + " 을 공격합니다");
        marine.beAttacked(this.power);
    }

    // 내가 공격을 받다.
    public void beAttacked(int power) {
        // 방어적 코드
        // 현재 -10 근데 공격이들어오려고함.
        if (this.hp <= 0) {
            System.out.println(name + "이(가) 이미 사망하였습니다.");
            // 실행에 제어권을 반납하고 싶으면 키워드 !! (돌아가)
            return;
        }
        this.hp -= power;
        System.out.println(name + "이(가) 공격을 당합니다. 그리고 체력이 " + hp + "만큼 남았습니다.");
    }


    // 상태를 보여주는 행위
    public void showInfo() {
        System.out.println("---------⭐상태창⭐---------");
        System.out.println("질럿 이름 : " + name);
        System.out.println("질럿 공격력 : " + power);
        System.out.println("질럿 체력 : " + hp);
    }

}
