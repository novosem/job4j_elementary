package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void whenBound5Then014916() {
        int bound = 5;
        int[] actual = new int[]{0, 1, 4, 9, 16};
        int[] expected = Square.calculate(bound);
        Assert.assertArrayEquals(actual, expected);
    }
}