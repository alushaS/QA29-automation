package com.tms.lesson9.impl;

import com.tms.lesson9.exc.InvalidBalanceException;
import com.tms.lesson9.service.GameService;
import com.tms.lesson9.User;

public class GameServiceImpl implements GameService {

    @Override
    public void validate(int bid, User user) throws InvalidBalanceException {
        if (bid > user.getBalance()) {
            throw new InvalidBalanceException("Ставка не может превышать ваш баланс");
        }
        if (bid > 100) {
            throw new InvalidBalanceException("Ставка не может превышать 100");
        }
    }

    @Override
    public boolean play(int userNumber, int randomNumber) {
        return userNumber == randomNumber;
    }

    @Override
    public void change(User user, int bid, boolean isNumberTheSame) {
        if (isNumberTheSame) {
            user.setBalance(user.getBalance() + bid);
        } else {
            user.setBalance(user.getBalance() - bid);
        }
    }
}
