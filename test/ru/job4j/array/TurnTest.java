package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 2, 6};
        int[] excepted = new int[] {6, 2, 1, 4};
        int[] result = Turn.back(input);
        Assert.assertArrayEquals(excepted, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] excepted = new int[] {5, 4, 3, 2, 1};
        int[] result = Turn.back(input);
        Assert.assertArrayEquals(excepted, result);
    }
}