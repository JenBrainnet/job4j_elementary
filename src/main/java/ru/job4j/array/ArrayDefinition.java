package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);

        int[] numbers = new int[5];
        numbers[0] = 2006;
        numbers[1] = 2010;
        numbers[2] = 2014;
        numbers[3] = 2018;
        numbers[4] = 2022;
        int years = numbers[3];
        System.out.println(years);

        String[] names = new String[4];
        names[0] = "Petr";
        names[1] = "Stas";
        names[2] = "Alexey";
        names[3] = "Andrei";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }

}
