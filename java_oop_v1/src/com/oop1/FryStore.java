package com.oop1;

public class FryStore {

    static int count = 0;
    static int money = 10_000;
    static int inventory = 200;


    // 튀김을 판다
    public void sale(int money) {
        if (money >= 2000) {
            this.money += money;
            count++;
            this.inventory -= 10;
            System.out.println(count + "개 가 팔렸습니다.");
        } else {
            System.out.println("돈 들고 오시면 판매 가능합니다.");
        }
    }


    public void eat(int inventory) {
        if (inventory < 10) {
            System.out.println("재고가 떨어졌습니다 먹을 수 없어요.");
        } else {
            System.out.println("튀김 맛있게 드세요");
        }

    }

    public FryStore(int count, int money, int inventory) {
        this.count = count;
        this.money = money;
        this.inventory = inventory;
    }

    public void showInfo() {
        System.out.println("--------가게 상태-------");
        System.out.println("튀김 잔량 : " + inventory);
        System.out.println("튀김 판매수 : " + count);
        System.out.println("가게 수익금 : " + money);
    }

}
