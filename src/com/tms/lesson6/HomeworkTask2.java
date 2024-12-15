package com.tms.lesson6;

public class HomeworkTask2 {
    public static void printString(String string, int repeat){
        for(int i = 0; i < repeat; i++ ){
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        HomeworkTask2.printString("Hello world", 5);
    }
}
