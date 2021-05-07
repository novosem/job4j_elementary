package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void max() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void max1() {
        int left = 2;
        int right = 1;
        int expected = 2;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void max2() {
        int left = 2;
        int right = 2;
        int expected = 2;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void max3() {
        int left = 2;
        int right = 3;
        int third = 4;
        int expected = 4;
        int result = Max.max(left, right, third);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void max4() {
        int left = 1;
        int right = 2;
        int third = 3;
        int fourth = 4;
        int expected = 4;
        int result = Max.max(left, right, third, fourth);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void max5() {
        int left = 2;
        int right = 2;
        int third = 2;
        int expected = 2;
        int result = Max.max(left, right, third);
        Assert.assertEquals(expected, result);
    }
}