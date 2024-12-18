package com.tms.lesson5;

public class MainApp {
    public static void main(String[] args) {

    Student student1 = new Student("Петров", "Антон", 19, 7);
    Student student2 = new Student("Иванов", "Семен", 18);
    Student student3 = new Student("Гордеев", "Максим");

    student2.lectures = 8;
    student3.lectures = 10;

    System.out.println(student1.fullName());
    System.out.println(student2.fullName());
    System.out.println(student3.fullName());

    student1.displayLectures();
    student2.displayLectures();
    student3.displayLectures();
    }
}
