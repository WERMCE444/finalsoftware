package org.example;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private String Name;
    private ArrayList<Product> productList1;  // First ArrayList of products
    private ArrayList<Product> productList2;  // Second ArrayList of products
    private ArrayList<Product> productList3;  // third ArrayList of products

    public Category(String Name) {
        this.Name = Name;
        this.productList1 = new ArrayList<>();
        this.productList2 = new ArrayList<>();
    }

    public String getName() {
        return Name;
    }

    public ArrayList<Product> getProductList1() {
        return productList1;
    }

    public ArrayList<Product> getProductList2() {
        return productList2;
    }
    public ArrayList<Product> getProductList3() {
        return productList3;
    }

    public void addProductToList1(Product product) {
        productList1.add(product);
    }

    public void addProductToList2(Product product) {
        productList2.add(product);
    }

    @Override
    public String toString() {
        return "Category: " + Name + "\nProducts List 1: " + productList1 + "\nProducts List 2: " + productList2;
    }

}


