package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP17K8Square7dot13() {
        double expected = 7.13;
        int p = 17;
        double k = 8;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP399K499Square79dot44() {
        double expected = 79.44;
        int p = 399;
        double k = 499;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}