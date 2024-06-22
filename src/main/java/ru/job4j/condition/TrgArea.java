package ru.job4j.condition;

/**
 * Класс для вычисления площади треугольника по формуле Герона.
 */
public class TrgArea {

    /**
     * Вычисляет площадь треугольника по длинам его сторон.
     * @param a длина первой стороны
     * @param b длина второй стороны
     * @param c длина третьей стороны
     * @return площадь треугольника
     * @throws IllegalArgumentException если стороны не могут образовать треугольник
     */
    public static double area(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Стороны треугольника должны быть положительными числами");
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Сумма любых двух сторон должна быть больше третьей стороны");
        }

        double p = (a + b + c) / 2;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result;
    }

    /**
     * Главный метод программы. Точка входа.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        try {
            double rsl = TrgArea.area(2, 2, 2);
            System.out.printf("Площадь треугольника со сторонами 2, 2, 2 = %.2f%n", rsl);
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
