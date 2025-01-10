package com.tms.lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductService {

    public boolean findByName(List<Product> productList, String productName) {
        boolean isFound = false;
        for (Product product : productList) {
            if (Objects.equals(product.getName(), productName)) {
                isFound = true;
                break;
            }
        }
        return isFound;
    }

    public List<Product> findProductsWithPriceMoreThan(List<Product> productList, int price){
        List<Product> productsFound = new ArrayList<>();
        for(Product product : productList){
            if(product.getPrice() > price){
                productsFound.add(product);
            }
        }
        return productsFound;
    }


    public int findAllProductsQuantity(List<Product> productList){
        int productQuantity = 0;
        for (Product product : productList){
            productQuantity += product.getQuantity();
        }
        return productQuantity;
    }
}
