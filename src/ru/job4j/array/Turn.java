package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp;
        int lastIndex = array.length - 1;
        for (int index = 0; index < array.length / 2; index++) {
            temp = array[index];
            array[index] = array[lastIndex];
            array[lastIndex] = temp;
            lastIndex--;
        }
        return array;
    }
}
