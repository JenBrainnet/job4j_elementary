package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenStartNegativeFinishPositiveSumZero() {
        int start = -10;
        int finish = 10;
        int expected = 0;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartNegativeFinishPositiveSumNegative() {
        int start = -11;
        int finish = 10;
        int expected = -11;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartNegativeFinishPositiveSumPositive() {
        int start = -10;
        int finish = 11;
        int expected = 11;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartZeroFinishPositiveSumPositive() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartNegativeFinishZeroSumNegative() {
        int start = -10;
        int finish = 0;
        int expected = -55;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartZeroFinishZeroSumZero() {
        int start = 0;
        int finish = 0;
        int expected = 0;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartGreaterFinishSumZero() {
        int start = 10;
        int finish = 0;
        int expected = 0;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartPositiveEqualsFinishSumPositive() {
        int start = 10;
        int finish = 10;
        int expected = 10;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartNegativeEqualsFinishSumNegative() {
        int start = -10;
        int finish = -10;
        int expected = -10;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

}