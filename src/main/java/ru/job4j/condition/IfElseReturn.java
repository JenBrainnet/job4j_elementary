package ru.job4j.condition;

public class IfElseReturn {

    public static boolean greaterThen(int first, int second) {
        return first > second;
    }

    public static void main(String[] args) {
        boolean result = greaterThen(10, 2);
        System.out.println(result);
    }
}
