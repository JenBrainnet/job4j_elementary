package ru.job4j.loop;

public class Remain {

    public static int modulo(int number, int divider) {
        while (number >= divider) {
            number -= divider;
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println("Результат вычисления остатка от деления:" + modulo(7, 3));
        System.out.println("Результат вычисления остатка от деления:" + modulo(15, 5));
        System.out.println("Результат вычисления остатка от деления:" + modulo(17, 3));
        System.out.println();
        System.out.println("Результат вычисления остатка от деления:" + 7 % 3);
        System.out.println("Результат вычисления остатка от деления:" + 15 % 5);
        System.out.println("Результат вычисления остатка от деления:" + 17.5 % 3);
        System.out.println();
        System.out.println("Результат вычисления остатка от деления: " + -7 % 3);
        System.out.println("Результат вычисления остатка от деления: " + -15 % 5);
        System.out.println("Результат вычисления остатка от деления: " + -17 % -3);
    }

}
