package com.tms.lesson11;

public class User implements Comparable<User> {

    private Integer age;
    private String name;

    public String getName() {
        return name;
    }


    public User(Integer age, String name) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    @Override
    public int compareTo(User user) {
        return age - user.age;
    }
}
