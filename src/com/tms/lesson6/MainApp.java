package com.tms.lesson6;

public class MainApp {
    public static void main(String[] args) {
        Product[] productList = {
                new Product(ProductType.AUDIO, 450, "Магнитофон", true),
                new Product(ProductType.MOBILE, 1300, "Iphone 15 Pro Max", true),
                new Product(ProductType.TV, 2000, "Samsung TV",  true),
                new Product(ProductType.MOBILE, 700, "Iphone 16 Pro", false)

        };


        ProductService productService = new ProductService();
        int quantity;
        int price;
        ProductType type = ProductType.MOBILE;

        quantity = productService.getQuantityByType(productList, type);
        System.out.println("Количество доступных товаров типа " + type + ": " + quantity);


        price = productService.getPriceByType(productList, type);
        System.out.println("Стоимость товаров типа " + type + ": " + price);



    }
}
