package com.hillel.solonenko.lessons.homework19;


import java.util.Arrays;

public class ArraysReplace {
    public static void main(String[] args) {
        int[] array = new int[]{1,3, 5, 7, 9, 11,13};
        int[] array1 = new int[]{2, 4, 6, 8, 10,12};
        int a = array.length + array1.length;
        int[] array2 = new int[a];
        for (int i = 0; i < array.length;) {
            array2[i] = array[i];
            i++;
        }
        for (int j = array2.length / 2 + 1,i = 0; j < a; j++,i++) {
            array2[j] = array1[i];
        }
        System.out.print(Arrays.toString(array2));
    }
}
