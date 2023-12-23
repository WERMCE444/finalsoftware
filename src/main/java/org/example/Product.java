package org.example;

import java.util.ArrayList;

public class Product {
    public String category;
    public String Name;
    public String availability;
    public Integer price;
    public Integer ID;
    public String Product_Descriptio;
    public String image;
    public boolean IsConfirmed = true;
    public ArrayList<String> Category = new ArrayList<>();
    public static ArrayList<Product> ListProduct = new ArrayList<>();

    public Product(String Name, Integer ID, Integer price, String image) {
    }

    public void addproduct() {
        this.initial();
    }

    public void initial() {
        this.image = "urdbz.jpg";
        this.Name = "car";
        this.price = Integer.valueOf("100");
        this.ID = Integer.valueOf("8557510");

        ListProduct.add(this);
    }

    public static boolean successfuladd(String Name) {
        boolean flag = true;

        for (int i = 0; i < ListProduct.size(); i++)
            if ( ListProduct.get(i).getName().equals(Name));{
            flag = true;   }

        flag = false;

        return flag;
    }
    public boolean checkprice (Integer price){
        boolean flag ;
        if (price>0) { flag = true ; }
        else { flag = false ; }
        return false ;
    }

    public boolean checkimage (String image){
        boolean flag ;
        if (image.endsWith(".jpg")) { flag = true ; }
        else { flag = false ; }
        return false ;
    }

    public String getName() {   return Name;    }
    public String setName() {   return Name;    }
    public Integer getprice() {  return price;  }
    public Integer setprice() {  return price;  }
    public Integer getid() {   return ID;    }
    public Integer setid() {   return ID;    }

    static class Purchase {
        private String product;
        private int quantity;

        public Purchase(String product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }

        public String getProduct() {
            return product;
        }

        public int getQuantity() {
            return quantity;
        }

       /*public double getTotalCost() {

          return System.out.println("4");
        }*/
    }}
