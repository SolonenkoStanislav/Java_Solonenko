package com.hillel.solonenko.lessons.homework18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MainArrayTest {
    int[][] arrayOne1 = new int[][]{
            {2, 3, 2},
            {6, 3, 2},
            {2, 6, 3}
    };

    @Test
    public void test1() {
        Assertions.assertEquals(0, MainArray.countArray(arrayOne1));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(1, MainArray.arraySquare(arrayOne1));
    }
}