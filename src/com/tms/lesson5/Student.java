package com.tms.lesson5;

public class Student {
    String surname;
    String name;
    int age;
    int lectures;

    Student(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    Student(String surname, String name, int age) {
        this.surname = surname;
        this.name = name;
        this.age = age;
    }
    Student(String surname, String name, int age, int lectures) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.lectures = lectures;
    }

    public String fullName () {
        return name + " " + surname;
    }

    public void displayLectures() {
        System.out.println(surname + " посещает " + this.lectures + " занятий.");
    }
}
