package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] excepted = {4, 2, 3, 1};
        Assert.assertArrayEquals(result, excepted);
    }

    @Test
    public void whenSwap0to5() {
        int[] input = {10, 6, 7, 8, 9, 5};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] excepted = {5, 6, 7, 8, 9, 10};
        Assert.assertArrayEquals(result, excepted);
    }
}