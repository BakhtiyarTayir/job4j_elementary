package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.array.SwitchArray;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to2() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {3, 2, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }
}