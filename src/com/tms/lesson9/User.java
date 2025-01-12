package com.tms.lesson9;

public class User {
    private String name;
    private int balance;

    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
