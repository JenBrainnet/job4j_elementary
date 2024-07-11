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

    @Test
    void whenMax0and5and10Then10() {
        int first = 0;
        int second = 5;
        int third = 10;
        int result = Max.max(first, second, third);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10and5and0Then10() {
        int first = 10;
        int second = 5;
        int third = 0;
        int result = Max.max(first, second, third);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2and1and4and3Then4() {
        int first = 2;
        int second = 1;
        int third = 4;
        int forth = 3;
        int result = Max.max(first, second, third, forth);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4and3and2and1Then4() {
        int first = 4;
        int second = 3;
        int third = 2;
        int forth = 1;
        int result = Max.max(first, second, third, forth);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

}