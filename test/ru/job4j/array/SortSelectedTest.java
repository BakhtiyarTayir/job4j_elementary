package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort3() {
        int[] data = new int[] {4, 89, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {4, 8, 89};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }
}