package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MachineTest {

    @Test
    void whenMoneyEqualsPrice() {
        int money = 100;
        int price = 100;
        int[] result = Machine.change(money, price);
        int[] expected = {};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenMoney50Price35() {
        int money = 50;
        int price = 35;
        int[] result = Machine.change(money, price);
        int[] expected = {10, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenMoney50Price21() {
        int money = 50;
        int price = 21;
        int[] result = Machine.change(money, price);
        int[] expected = {10, 10, 5, 2, 2};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenMoney50Price32() {
        int money = 50;
        int price = 32;
        int[] result = Machine.change(money, price);
        int[] expected = {10, 5, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenMoney100Price46() {
        int money = 100;
        int price = 46;
        int[] result = Machine.change(money, price);
        int[] expected = {10, 10, 10, 10, 10, 2, 2};
        assertThat(result).containsExactly(expected);
    }

}