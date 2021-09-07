package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int summ = money - price;
        for (int coin : coins) {
            while (summ - coin >= 0) {
                summ = summ - coin;
                rsl[size] = coin;
                size++;
            }
        }
        return  Arrays.copyOf(rsl, size);
    }
}
