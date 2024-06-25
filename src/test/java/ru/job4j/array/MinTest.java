package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MinTest {

    @Test
    void whenFirstMin() {
        int[] array = {0, 5, 10};
        int result = Min.findMin(array);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenLastMin() {
        int[] array = {10, 5, 3};
        int result = Min.findMin(array);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMiddleMin() {
        int[] array = {10, 2, 5};
        int result = Min.findMin(array);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

}