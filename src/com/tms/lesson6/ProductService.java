package com.tms.lesson6;

public class ProductService {

    public void printPriceByType(Product[] productList, ProductType type) {
        for (Product product : productList) {
            if (product.productType == type) {
                System.out.println("Стоимость продукта типа " + type + ": " + product.price);
            }
        }
    }


    public void printQuantityByType(Product[] productList, ProductType type) {
        int productQuantity = 0;
        for (Product product : productList) {
            if (product.productType == type && product.isAvailable == true) {
                productQuantity++;
            }
        }
        System.out.println("Количество доступных товаров типа " + type + ": " + productQuantity);
    }
}

