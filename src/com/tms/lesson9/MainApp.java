package com.tms.lesson9;

import com.tms.lesson9.impl.GameHandlerImpl;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.println("Введите сумму на счете: ");
        int balance = scanner.nextInt();

        var user = new User(name, balance);
        var gameHandler = new GameHandlerImpl(user);

        gameHandler.run();

        scanner.close();
    }
}
