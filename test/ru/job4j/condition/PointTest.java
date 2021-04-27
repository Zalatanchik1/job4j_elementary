package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        double out = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to20then4() {
        double expected = 4.47;
        double out = Point.distance(8, 7, 12, 9);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to20then31() {
        double expected = 31.14;
        double out = Point.distance(65, 12, 34, 9);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to20then39() {
        double expected = 39.66;
        double out = Point.distance(11, 55, 44, 33);
        Assert.assertEquals(expected, out, 0.01);
    }
}

