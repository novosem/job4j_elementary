package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int p = 6;
        int k = 2;
        double excepted = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(excepted, out, 0.01);
    }

    @Test
    public void whenP14K6Square6() {
        int p = 14;
        int k = 6;
        double excepted = 6;
        double out = SqArea.square(p, k);
        Assert.assertEquals(excepted, out, 0.01);
    }

    @Test
    public void whenP22K5Square1680() {
        int p = 22;
        int k = 5;
        double excepted = 16.80;
        double out = SqArea.square(p, k);
        Assert.assertEquals(excepted, out, 0.01);
    }
}