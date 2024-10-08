package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to2() {
        int[] input = {4, 2, 3, 1};
        int source = 1;
        int dest = 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 3, 2, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3to5() {
        int[] input = {1, 2, 3, 6, 7, 4, 5};
        int source = 3;
        int dest = 5;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 4, 7, 6, 5};
        Assert.assertArrayEquals(expected, result);
    }
}