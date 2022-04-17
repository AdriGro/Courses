package com.lecture5;

public class Horse implements Animal{

    String food;
    String location;
    boolean allergicToSugar;
    int amountOfHorseshoes;

    Horse (String food, String location, boolean allergicToSugar, int amountOfHorseshoes) {
        this.food = food;
        this.location = location;
        this.allergicToSugar = allergicToSugar;
        this.amountOfHorseshoes = amountOfHorseshoes;
    }

    @Override
    public void makeNoise() {
        System.out.println("Ihooo-how");
    }

    @Override
    public void eat() {
        System.out.println("Sugar piece? Yes, please");
    }
}
