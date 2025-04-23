package com.Inheritance;

public class Customer {

    private int customerID;
    private String customerName;
    private String customerGrade;
    private int bonusPoint;
    private double bonusRatio;


    public double getBonusRatio() {
        return bonusRatio;
    }

    public int calcPrice() {
        return (int)(bonusPoint*0.01);
    }



    public String showCustomerInfo() {
//        System.out.println("---- 고객정보 ----");
//        System.out.println("고객 ID  : " + customerID);
//        System.out.println("고객이름  : " + customerName);
//        System.out.println("고객등급  : " + customerGrade);

        return "--- 고객정보 ---- \n" + "고객 ID : " + customerID
                + "\n" + "고객이름 : " + customerName
                + "\n" + "고객등급 : " + customerGrade;


    }


}
