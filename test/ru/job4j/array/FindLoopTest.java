package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int excepted = 0;
        int result = FindLoop.indexOf(data, el);
        Assert.assertEquals(excepted, result);
    }

    @Test
    public void whenArrayHas1ThenNeg1() {
        int[] data = {5, 4, 3, 2};
        int el = 1;
        int excepted = -1;
        int result = FindLoop.indexOf(data, el);
        Assert.assertEquals(excepted, result);
    }
}