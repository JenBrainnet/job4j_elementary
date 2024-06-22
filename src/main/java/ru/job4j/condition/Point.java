package ru.job4j.condition;

/**
 * Класс для вычисления расстояния между двумя точками на плоскости.
 */
public class Point {

    /**
     * Вычисляет расстояние между двумя точками на плоскости.
     * @param x1 координата x первой точки
     * @param y1 координата y первой точки
     * @param x2 координата x второй точки
     * @param y2 координата y второй точки
     * @return расстояние между двумя точками
     */
    public static double distance(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 9, 2, 15);
        System.out.println("result (1, 9) to (2, 15) " + result);
    }
}