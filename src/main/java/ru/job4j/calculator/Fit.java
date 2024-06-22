package ru.job4j.calculator;

/**
 * Калькулятор для расчета идеального веса.
 */
public class Fit {

    /**
     * Рассчитывает идеальный вес для мужчин на основе роста.
     * @param height рост в сантиметрах
     * @return идеальный вес в килограммах
     */
    public static double manWeight(short height) {
        return calculateWeight(height, 100);
    }

    /**
     * Рассчитывает идеальный вес для женщин на основе роста.
     * @param height рост в сантиметрах
     * @return идеальный вес в килограммах
     */
    public static double womanWeight(short height) {
        return calculateWeight(height, 110);
    }

    /**
     * Общий метод для расчета идеального веса на основе роста и корректирующего коэффициента.
     * @param height рост в сантиметрах
     * @param adjustment корректирующее значение для пола (100 для мужчин, 110 для женщин)
     * @return идеальный вес в килограммах
     */
    private static double calculateWeight(short height, int adjustment) {
        if (height <= 0) {
            throw new IllegalArgumentException("Рост должен быть больше нуля");
        }

        double result = (height - adjustment) * 1.15;
        return result;
    }

    /**
     * Главный метод программы. Точка входа.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.printf("Идеальный вес для мужчины с ростом %d см составляет %.2f кг%n", height, man);
    }
}
