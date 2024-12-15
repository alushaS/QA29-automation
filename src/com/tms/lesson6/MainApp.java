package com.tms.lesson6;

public class MainApp {
    public static void main(String[] args) {
        Product[] productList = {
                new Product(ProductType.AUDIO, 450, "Магнитофон", true),
                new Product(ProductType.MOBILE, 1300, "Iphone 15 Pro Max", true),
                new Product(ProductType.TV, 2000, "Samsung TV",  true),
                new Product(ProductType.MOBILE, 800, "Iphone 16 Pro", true)

        };


        ProductService productService = new ProductService();

        productService.printPriceByType(productList, ProductType.MOBILE);
        productService.printQuantityByType(productList, ProductType.MOBILE);


    }
}
