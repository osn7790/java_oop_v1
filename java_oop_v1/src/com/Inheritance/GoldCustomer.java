package com.Inheritance;

public class GoldCustomer extends Customer {

    private int goldId;
    private int couponcount;

    public GoldCustomer(int goldId, int couponcount){
        this.goldId = goldId;
        this.couponcount = couponcount;
    }



    // 1 ~ 100번째까지는 무료
    // 101 ~ 200번째까지는 쿠폰 1장
    // 201 ~ 300번째는 쿠폰 3장
    // 301 ~ 400번쨰는 쿠폰 5장


}
