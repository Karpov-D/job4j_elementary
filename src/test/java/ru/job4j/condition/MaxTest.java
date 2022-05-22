package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax50To2Then50() {
        int left = 50;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 50;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax50To50Then50() {
        int left = 50;
        int right = 50;
        int result = Max.max(left, right);
        int expected = 50;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax50To51To52To53Then53() {
        int first = 50;
        int second = 51;
        int third = 52;
        int fourth = 53;
        int result = Max.max(first, second, third, fourth);
        int expected = 53;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax50To51To50To53Then55() {
        int first = 50;
        int second = 51;
        int third = 50;
        int fourth = 55;
        int result = Max.max(first, second, third, fourth);
        int expected = 55;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax50To501To50Then501() {
        int first = 50;
        int second = 501;
        int third = 50;
        int result = Max.max(first, second, third);
        int expected = 501;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax50To5To50Then50() {
        int first = 50;
        int second = 5;
        int third = 50;
        int result = Max.max(first, second, third);
        int expected = 50;
        Assert.assertEquals(result, expected);
    }
}