package com.Lecture10;

public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop();

        Product pr1 = new Product(1, "Bee", 10);
        Product pr2 = new Product(2, "Dog", 23);
        Product pr3 = new Product(3, "Cat", 56);


        shop.addProduct(pr1);
        shop.addProduct(pr2);
        shop.addProduct(pr3);
        shop.addProduct(pr3);

        shop.sort();
        shop.print();

        shop.removeProduct(1);

        shop.print();

        Product pr4 = new Product(3, "SuperCat", 5000000);
        shop.replaceProduct(pr4);
        shop.print();

        shop.reverseProduct();
        shop.print();

    }
}
