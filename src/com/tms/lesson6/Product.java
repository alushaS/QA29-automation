package com.tms.lesson6;

public class Product {

    public ProductType productType;
    public int price;
    public String title;
    public boolean isAvailable;


        public Product(ProductType productType, int price, String title, boolean isAvailable){
            this.productType = productType;
            this.price = price;
            this.title = title;
            this.isAvailable = isAvailable;

        }


    }
