package com.lecture5;

public interface Animal {

    void makeNoise();
    void eat();
    default void sleep(){
        System.out.println("Animal is sleeping! Shhh..");
    }
}
