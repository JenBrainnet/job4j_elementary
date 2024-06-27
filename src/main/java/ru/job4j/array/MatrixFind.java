package ru.job4j.array;

public class MatrixFind {

    public static void find(int[][] array, int element) {
        System.out.println("Find element : " + element);
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                int value = array[row][cell];
                if (value == element) {
                    System.out.println("row : " + row + ", cell : " + cell);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {3, 2, 1},
                {2, 3, 1}
        };
        MatrixFind.find(array, 3);
    }

}
