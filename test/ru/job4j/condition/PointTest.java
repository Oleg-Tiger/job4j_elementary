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
    public void whenMinus13to35then4() {
        double expected = 4.47;
        double out = Point.distance(-1, 3, 3, 5);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2Minus3toMinus3Minus5then5() {
        double expected = 5.385;
        double out = Point.distance(2, -3, -3, -5);
        Assert.assertEquals(expected, out, 0.01);

    }
}