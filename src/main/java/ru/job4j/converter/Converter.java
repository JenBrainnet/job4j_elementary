package ru.job4j.converter;

/**
 * Класс для конвертации рублей в евро и доллары.
 */
public class Converter {
    private static final float EURO_RATE = 70;
    private static final float DOLLAR_RATE = 60;

    /**
     * Конвертирует рубли в евро.
     * @param value количество рублей
     * @return количество евро
     */
    public static float rubleToEuro(float value) {
        if (value < 0) {
            throw new IllegalArgumentException("Количество рублей не может быть отрицательным");
        }
        return value / EURO_RATE;
    }

    /**
     * Конвертирует рубли в доллары.
     * @param value количество рублей
     * @return количество долларов
     */
    public static float rubleToDollar(float value) {
        if (value < 0) {
            throw new IllegalArgumentException("Количество рублей не может быть отрицательным");
        }

        return value / DOLLAR_RATE;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        in = 180;
        expected = 3;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("180 rubles are 3. Test result : " + passed);
    }
}
