package com.lecture_5;

public class CreditCard {

    int accountNumber = 345678567;
    int currentSumAvailable = 240;
    int moneyForAdding;
    int moneyTaken;

    public int AddMoney(int moneyForAdding) {
        currentSumAvailable += moneyForAdding;
        return currentSumAvailable;
    }

    public int WithdrawMoney(int moneyTaken){
        currentSumAvailable -= moneyTaken;
        return currentSumAvailable;
    }

    public void GeneralInfo () {
        System.out.println(accountNumber);
        System.out.println(currentSumAvailable);;
    }


    CreditCard (int accountNumber, int currentSumAvailable){
        this.accountNumber = accountNumber;
        this.currentSumAvailable = currentSumAvailable;
    }

}