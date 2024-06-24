package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RollBackArrayTest {

    @Test
    void whenEmpty() {
        int[] input = {};
        int[] result = RollBackArray.rollback(input);
        int[] expected = {};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenOne() {
        int[] input = {1};
        int[] result = RollBackArray.rollback(input);
        int[] expected = {1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenFull() {
        int[] input = {1, 2, 3, 4};
        int[] result = RollBackArray.rollback(input);
        int[] expected = {4, 3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTheSame() {
        int[] input = {1, 1, 1, 1};
        int[] result = RollBackArray.rollback(input);
        int[] expected = {1, 1, 1, 1};
        assertThat(result).containsExactly(expected);
    }

}