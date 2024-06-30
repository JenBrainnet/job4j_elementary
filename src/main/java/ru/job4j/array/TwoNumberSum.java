package ru.job4j.array;

public class TwoNumberSum {

    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            int sum = array[i] + array[j];
            if (sum == target) {
                break;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return i >= j ? new int[0] : new int[] {i, j};
    }

}
