package com.tms.lesson4;

public class Homework4Task2 {
    public static void main(String[] args) {
        int[] array = new int[]{7, 5, 156, 54, 15, 155, 48, 50, 18, 500, 1};
        int sum = 0;
        int maxElement = array[0];
        int minElement = array[0];


        for (int j : array) {
            sum += j;
            if (j > maxElement) maxElement = j;
            if (j < minElement) minElement = j;
        }
        System.out.println("Количество элементов массива: " + array.length);
        System.out.println("Cумма элементов массива: " + sum);
        System.out.println("Максимальный элемент массива: " + maxElement);
        System.out.println("Минимальный элемент массива: " + minElement);

    }
}



