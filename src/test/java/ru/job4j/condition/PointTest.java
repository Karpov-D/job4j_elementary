package ru.job4j.condition;


import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when49to76then2() {
        double expected = 4.24;
        int x1 = 4;
        int y1 = 9;
        int x2 = 7;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when25to52then2() {
        double expected = 4.24;
        int x1 = 2;
        int y1 = 5;
        int x2 = 5;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when19to28then2() {
        double expected = 1.41;
        int x1 = 1;
        int y1 = 9;
        int x2 = 2;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
