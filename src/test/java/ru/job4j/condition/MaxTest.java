package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1ToMinus1Then1() {
        int left = 1;
        int right = -1;
        int expected = 1;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxMinus1To1Then1() {
        int left = -1;
        int right = 1;
        int expected = 1;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To1Then1() {
        int left = 1;
        int right = 1;
        int expected = 1;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }
}