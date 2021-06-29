package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {
    @Test
    public void whenArrayHasLength5Then0() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind21() {
        int[] data = new int[]{1, 2, 3, 5, 8, 13, 21, 34, 55};
        int el = 21;
        int start = 4;
        int finish = 6;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void notFoundElement() {
        int[] data = new int[]{1, 2, 3, 5, 8, 13, 21, 34, 55};
        int el = 21;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}