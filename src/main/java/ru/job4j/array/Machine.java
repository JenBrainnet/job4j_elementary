package ru.job4j.array;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        money -= price;

        for (int i = 0; i < coins.length && money != 0; i++) {
            while (coins[i] <= money) {
                money -= coins[i];
                result[size++] = coins[i];
            }
        }
        return Arrays.copyOf(result, size);
    }

}
