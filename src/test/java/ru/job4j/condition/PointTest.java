package ru.job4j.condition;


import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when49to76then4dot24() {
        double expected = 4.24;
        Point a = new Point(4, 9);
        Point b = new Point(7, 6);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when25to52then4dot24() {
        double expected = 4.24;
        Point a = new Point(2, 5);
        Point b = new Point(5, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when19to28then1dot41() {
        double expected = 1.41;
        Point a = new Point(1, 9);
        Point b = new Point(2, 8);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1916to2812then4dot24() {
        double expected = 4.24;
        Point a = new Point(1, 9, 16);
        Point b = new Point(2, 8, 12);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1613to249then4dot58() {
        double expected = 4.58;
        Point a = new Point(1, 6, 13);
        Point b = new Point(2, 4, 9);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
