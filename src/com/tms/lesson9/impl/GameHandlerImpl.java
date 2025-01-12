package com.tms.lesson9.impl;


import com.tms.lesson9.exc.InvalidBalanceException;
import com.tms.lesson9.service.GameService;
import com.tms.lesson9.User;

import java.util.Random;
import java.util.Scanner;

public class GameHandlerImpl implements lesson9.service.GameHandler {

    private final User user;
    private final GameService gameService;
    private final Random random;

    public GameHandlerImpl(User user) {
        this.user = user;
        this.gameService = new GameServiceImpl();
        this.random = new Random();
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (user.getBalance() > 0) {
            System.out.println("Введите вашу ставку: ");
            int bid = scanner.nextInt();

            try {
                gameService.validate(bid, user);

                System.out.println("Введите число от 0 до 5 для продолжения или -1, если хотите выйти: ");
                int userNumber = scanner.nextInt();

                if (userNumber == -1) {
                    System.out.println("Игра окончена");
                    break;
                }

                if (userNumber < 0 || userNumber > 5) {
                    System.out.println("Введите число от 0 до 5");
                    continue;
                }

                int randomNumber = random.nextInt(6);
                System.out.println("Выпало число: " + randomNumber);

                boolean isNumberTheSame = gameService.play(userNumber, randomNumber);
                gameService.change(user, bid, isNumberTheSame);

                if (isNumberTheSame) {
                    System.out.println("Вы выиграли!");
                } else {
                    System.out.println("Вы проиграли");
                }

                System.out.println("Ваш текущий баланс: " + user.getBalance());

            } catch (InvalidBalanceException e) {
                System.out.println(e.getMessage());
            }
        }

        if (user.getBalance() <= 0) {
            System.out.println("Игра окончена, у вас закончились деньги.");
        }

        scanner.close();
    }
}

