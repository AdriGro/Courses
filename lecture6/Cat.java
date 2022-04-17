package com.lecture5;

public class Cat implements Animal{

    String food;
    String location;
    boolean isShowCat;

    Cat (String food, String location, boolean isShowCat) {
        this.food = food;
        this.location = location;
        this.isShowCat = isShowCat;
    }

    @Override
    public void makeNoise() {
        System.out.println("Meooow");
    }

    @Override
    public void eat() {
        System.out.println("High time for milk");
    }
}
