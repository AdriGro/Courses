package com.Lecture10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {

    private List<Product> listOfProducts = new ArrayList<>();
    Comparator<Product> com1 = new PriceComparator();

    public void addProduct(Product product) {
        for (Product listOfProduct : listOfProducts) {
            if (listOfProduct.getId() == product.getId()) {
                return;
            }
        }
        listOfProducts.add(product);
    }

    public List<Product> getAll() {
        return listOfProducts;
    }

    public void removeProduct (int productsId) {
        for (int i = 0; i < listOfProducts.size(); i++) {
            if (listOfProducts.get(i).getId() == productsId) {
                listOfProducts.remove(i);
                return;
            }
        }
    }

    public void sort () {
        listOfProducts.sort(com1);
    }

    public void print() {
        System.out.println("/////////");
        for (Product e: listOfProducts) {
            System.out.println(e);
        }
    }

    public void replaceProduct (Product product) {
        for (Product targetProduct : listOfProducts) {
            if (targetProduct.getId() == product.getId()) {
                targetProduct.setName(product.getName());
                targetProduct.setPrice(product.getPrice());
                return;
            }
        }
    }

    public void reverseProduct(){
        Collections.reverse(listOfProducts);
    }


}
