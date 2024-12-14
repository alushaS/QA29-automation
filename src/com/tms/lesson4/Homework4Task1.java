package com.tms.lesson4;

public class Homework4Task1 {
    public static void main(String[] args) {
        int[] array1 = new int[]{0,2,6,8,5,7,3,1};
        int[] array2 = new int[]{1,9,3,7,0,5};

        for (int j = 0; j < array1.length; j++){
            for (int i = 0; i <array2.length; i++){
                if (array1[j]==array2[i]){
                    System.out.println(array1[j]);
                }
            }
        }

    }
}
