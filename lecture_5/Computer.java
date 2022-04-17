package com.lecture_5;


public class Computer {

    int price;
    String model;
    RAM ram;
    HDD hdd;


    public static class HDD {
        String name;
        int volume;
        String type;

        public HDD() {
            this.name = "Tashiba";
            this.volume = 300;
            this.type = "Inner";
        }

        public HDD(String name, int volume, String type) {
            this.name = name;
            this.volume = volume;
            this.type = type;
        }

        public void getInfoHDD() {
            System.out.println(this.name + " " + this.volume + "Gb " + this.type);
        }

    }

    public static class RAM {
        String name;
        int volume;

        public RAM() {
            this.name = "Tashiba";
            this.volume = 512;
        }

        public RAM(String name, int volume) {
            this.name = name;
            this.volume = volume;
        }

        public void getInfoRAM() {
            System.out.println(this.name + " " + this.volume + "Gb");
        }

    }


    Computer(int price, String model) {

        this.price = price;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();

    }


    Computer(int price, String model, HDD hdd, RAM ram) {

        this.price = price;
        this.model = model;
        this.hdd = hdd;
        this.ram = ram;

    }

    public void getInfoComputer() {
        System.out.println(this.model + " - " + this.price + " $");
        ram.getInfoRAM();
        hdd.getInfoHDD();
    }


}
