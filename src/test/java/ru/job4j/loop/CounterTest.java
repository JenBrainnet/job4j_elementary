package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenSumNumbersFromMinus10To10Then0() {
        int start = -10;
        int finish = 10;
        int expected = 0;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumNumbersFromMinus11To10ThenMinus11() {
        int start = -11;
        int finish = 10;
        int expected = -11;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumNumbersFromMinus10To11Then11() {
        int start = -10;
        int finish = 11;
        int expected = 11;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumNumbersFrom0To10Then55() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumNumbersFromMinus10To0ThenMinus55() {
        int start = -10;
        int finish = 0;
        int expected = -55;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumNumbersFrom0To0Then0() {
        int start = 0;
        int finish = 0;
        int expected = 0;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumNumbersFrom10To0Then0() {
        int start = 10;
        int finish = 0;
        int expected = 0;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumNumbersFrom10To10Then10() {
        int start = 10;
        int finish = 10;
        int expected = 10;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumNumbersFromMinus10ToMinus10ThenMinus10() {
        int start = -10;
        int finish = -10;
        int expected = -10;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus10To2ThenMinus28() {
        int start = -10;
        int finish = 2;
        int result = Counter.sumByEven(start, finish);
        int expected = -28;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus10ToMinus1ThenMinus30() {
        int start = -10;
        int finish = -1;
        int result = Counter.sumByEven(start, finish);
        int expected = -30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom10To0Then0() {
        int start = 10;
        int finish = 0;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom2To2Then2() {
        int start = 2;
        int finish = 2;
        int result = Counter.sumByEven(start, finish);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

}