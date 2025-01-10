package com.tms.lesson10;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        Product product1 = new Product("iPhone", 1200, 5);
        Product product2 = new Product("iPad", 1300, 8);
        Product product3 = new Product("MacBook", 1800, 2);
        Product product4 = new Product("iMac", 2500, 3);

        List<Product> productList = new ArrayList<>();

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        ProductService productService = new ProductService();

        var isFound = productService.findByName(productList, "MacBook");

        if (isFound){
            System.out.println("Продукт найден в списке");
        } else {
            System.out.println("Продукт не найден в списке");
        }

        System.out.println("Товары, превышающие заданную стоимость: " +
                productService.findProductsWithPriceMoreThan(productList,800));

        var productsQuantity = productService.findAllProductsQuantity(productList);
        System.out.println("Количество всех товаров: " + productsQuantity);

        Product product5 = new Product("AirPods", 500, 1);

        productList.add(3, product5);

        System.out.println("Количество элементов в списке: " + productList.size());

        System.out.println("Наличие товара в списке: " + productList.contains(product5));

        System.out.println("Вывод товаров от начала списка до последнего добавленного: " + productList.subList(0, 4));

        List<Product> reversedList = new ArrayList<>();

        for (int i = productList.size() - 1; i >= 0; i--) {
            reversedList.add(productList.size() - 1 - i, productList.get(i));
        }

        System.out.println("Список товаров в обратной последовательности: " + reversedList);
    }
}
