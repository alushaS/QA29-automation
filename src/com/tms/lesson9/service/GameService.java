package com.tms.lesson9.service;

import com.tms.lesson9.exc.InvalidBalanceException;
import com.tms.lesson9.User;


public interface GameService {

    void validate(int bet, User user) throws InvalidBalanceException;

    boolean play(int userNumber, int randomNumber);

    void change(User user, int bet, boolean isWin);
}
