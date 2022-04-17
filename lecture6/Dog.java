package com.lecture5;

public class Dog implements Animal {

    String food;
    String location;
    String placeOfResidence;
    boolean isTrained;

    Dog (String food, String location, String placeOfResidence, boolean isTrained) {
        this.food = food;
        this.location = location;
        this.placeOfResidence = placeOfResidence;
        this.isTrained = isTrained;
    }

    @Override
    public void makeNoise() {
        System.out.println("Wooof");
    }

    @Override
    public void eat() {
        System.out.println("High time to gnaw a bone");
    }
}
