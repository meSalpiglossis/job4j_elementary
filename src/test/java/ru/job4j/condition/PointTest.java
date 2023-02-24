package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void when63to04then6dot082() {
        int x1 = 6;
        int y1 = 3;
        int x2 = 0;
        int y2 = 4;
        double expected = 6.082;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void when31to77then7dot211() {
        int x1 = 3;
        int y1 = 1;
        int x2 = 7;
        int y2 = 7;
        double expected = 7.211;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void when00to99then12dot727() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 9;
        int y2 = 9;
        double expected = 12.727;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.001);
    }
}