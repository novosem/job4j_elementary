package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2;
        double bc = 2;
        double ac = 2;
        boolean rsl = Triangle.exist(ab, bc, ac);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenExist1() {
        double ab = 1;
        double bc = 4;
        double ac = 2;
        boolean rsl = Triangle.exist(ab, bc, ac);
        Assert.assertFalse(rsl);
    }
}