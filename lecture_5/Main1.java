package com.lecture_5;

public class Main1 {

    public static void main(String[] args) {

        Computer comp1 = new Computer(4000, "Asus");
        comp1.getInfoComputer();

        Computer comp2 = new Computer(4000, "Мас", new Computer.HDD(), new Computer.RAM());
        comp2.getInfoComputer();

    }

}
