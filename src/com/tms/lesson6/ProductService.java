package com.tms.lesson6;

public class ProductService {

    public int getPriceByType(Product[] productList, ProductType type) {
        int price = 0;
        for (Product product : productList) {
            if (product.productType == type) {
                price += product.price;
            }
        } return price;
    }


    public int getQuantityByType(Product[] productList, ProductType type) {
        int productQuantity = 0;
        for (Product product : productList) {
            if (product.productType == type && product.isAvailable == true) {
                productQuantity++;
            }
        } return productQuantity;
    }
}

