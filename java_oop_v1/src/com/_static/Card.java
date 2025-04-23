package com._static;

// 신용카드
public class Card {

    static int cardId = 1;

    private int cardIdNumber;
    private String name;
    private String cardColor;

    public Card(String name) {
        this.name = name;
        cardIdNumber = Card.cardId;
        Card.cardId++;
    }

    public String getName(){
        return name;
    }

    public int getCardIdNumber(){
        return cardIdNumber;
    }


    //메인 함수

    public static void main(String[] args) {

        Card card1 = new Card("야스오");
        Card card2 = new Card("티모");

        System.out.println("야스오 : " + card1.getCardIdNumber());
        System.out.println("티모 : " + card2.getCardIdNumber());

    }



}
