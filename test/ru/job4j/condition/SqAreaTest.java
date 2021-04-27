package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square2() {
        double expected = 2;
        double out = SqArea.square(6, 2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square4() {
        double expected = 4;
        double out = SqArea.square(10, 4);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square10() {
        double expected = 9.91;
        double out = SqArea.square(18, 6);
        Assert.assertEquals(expected, out, 0.01);
    }
}