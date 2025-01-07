package com.tms.lesson10;

import java.util.List;
import java.util.Objects;

public class ProductService {

    public void findByName(List<Product> productList, String productName) {
        boolean isFound = false;
        for (Product product : productList) {
            if (Objects.equals(product.getName(), productName)) {
                isFound = true;
                System.out.println("Продукт " + productName + " найден в списке");
                break;
            }
        } if (!isFound){
            System.out.println("Продукт " + productName + " не найден в списке");
        }
    }

    public void findProductsWithPriceMoreThan(List<Product> productList, int price){
        boolean isFound = false;
        System.out.println("Товары, превышающие сумму " + price + ": ");
        for(Product product : productList){
            if(product.getPrice() > price){
                System.out.println(product.getName());
                isFound = true;
            }
        } if (!isFound){
            System.out.println("не найдены");
        }
    }


    public void printAllProductsQuantity(List<Product> productList){
        int productQuantity = 0;
        for (Product product : productList){
            productQuantity += product.getQuantity();
        }
        System.out.println("Количество всех товаров в списке: " + productQuantity);
    }
}
