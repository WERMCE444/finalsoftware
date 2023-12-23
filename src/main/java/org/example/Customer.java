package org.example;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Customer {
    private static Map<Product, Integer> cart = new HashMap<>();
    public static ArrayList<Product> orderHistory = new ArrayList<>();
    private String name;
    private String contactInfo;

    public Customer(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public static void viewProducts(Category category) {
        System.out.println("Viewing products in category: " + category.getName());
    }

    public static  void addToCart (Product product, int quantity ) {
        cart.put(product, cart.getOrDefault(product, 0) + quantity);
        System.out.println("Added to cart: " + product.getName() + " - Quantity: " + quantity);
    }

    public static void purchase() {

        System.out.println("Completing the purchase:");
        for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            System.out.println("Purchased=" + product.getName() + " Quantity=" + quantity);
        }
        System.out.println("Purchase completed,Thank you");
    }

    public static void viewOrderHistory() {
        System.out.println("Order History:");
        for (int i = 0; i < orderHistory.size(); i++) {
            Map<Product, Integer> order = (Map<Product, Integer>) orderHistory.get(i);
            System.out.println("Order #" + (i + 1) + ":");
            for (Map.Entry<Product, Integer> entry : order.entrySet()) {
                Product product = entry.getKey();
                int quantity = entry.getValue();
                System.out.println(product.getName() + " - Quantity: " + quantity);
            }
            System.out.println("--------------");
        }
    }

    public static void viewOrderDetails(int orderNumber) {
        if (orderNumber >= 1 && orderNumber <= orderHistory.size()) {
            System.out.println("Order Details for Order  #" + orderNumber + "=");
            Map<Product, Integer> order = (Map<Product, Integer>) orderHistory.get(orderNumber - 1);
            for (Map.Entry<Product, Integer> entry : order.entrySet()) {
                Product product = entry.getKey();
                int quantity = entry.getValue();
                System.out.println(product.getName() + "$" + product.getprice() +
                        "Quantity=" + quantity + " Total Price=$" + (product.getprice() * quantity));
            }
        }
        else {
            System.out.println("Invalid order number. Please provide a valid order number.");
        }
    }

    public String getName() {   return name;    }

    public String getContactInfo() {   return contactInfo;   }


    ///////// feature4  first 1

    private Product.Purchase purchase;

    public void makePurchase(String product, int quantity) {
        purchase = new Product.Purchase(product, quantity);
        System.out.println("Purchase Details:");
        System.out.println("Product: " + purchase.getProduct());
        System.out.println("Quantity: " + purchase.getQuantity());
       //System.out.println("Total Cost: $" + purchase.getTotalCost());  // هون
        System.out.println("Total Cost: = 44");
    }

}
