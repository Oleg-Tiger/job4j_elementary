package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        int expected = 2;
        double out = SqArea.square(6, 2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K1Then1() {
        int expected = 1;
        double out = SqArea.square(4, 1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP25K10Then12() {
        double expected = 12.91;
        double out = SqArea.square(25, 10);
        Assert.assertEquals(expected, out, 0.01);

    }
}