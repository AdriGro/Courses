package com.Lecture10;

public class Product {

    private int id;
    private String name;
    private int price;

    Product() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return this.name + " " + this.id + " " + this.price;
    }
}
