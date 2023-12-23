package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> selectedProducts;
    private double totalPrice;

    public ShoppingCart() {
        this.selectedProducts = new ArrayList<>();
    }

    public ShoppingCart(List<Product> selectedProducts) {
        this.selectedProducts = selectedProducts;
        calculateTotalPrice();
    }

    public void addToCart(Product product) {
        selectedProducts.add(product);
        System.out.println("Added to cart: " + product.getName());
    }

    public List<Product> getSelectedProducts() {
        return selectedProducts;
    }

    public double getTotalPrice() {
        return totalPrice;
    }


    private void calculateTotalPrice() {

        totalPrice = selectedProducts.stream().mapToDouble(Product::getprice).sum();
    }
}
