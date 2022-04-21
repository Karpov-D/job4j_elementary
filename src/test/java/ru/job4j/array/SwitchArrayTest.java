package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2to5() {
        int[] input = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        int source = 2;
        int dest = 5;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 7, 4, 6, 3, 8, 9, 10};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap7to4() {
        int[] input = {1, 2, 7, 4, 6, 3, 8, 9, 10};
        int source = 7;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 7, 4, 9, 3, 8, 6, 10};
        Assert.assertArrayEquals(expected, result);
    }
}