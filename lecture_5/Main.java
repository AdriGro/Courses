package com.lecture_5;

public class Main {

    public static void main(String[] args) {

        CreditCard card1 = new CreditCard(3467992, 4000);
        CreditCard card2 = new CreditCard(42551801, 567);
        CreditCard card3 = new CreditCard(8764576, 3895);

        card1.AddMoney(250);
        card2.AddMoney(120);
        card3.WithdrawMoney(345);

        card1.GeneralInfo();
        card2.GeneralInfo();
        card3.GeneralInfo();

    }
}
