package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {

    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas3Then2() {
        int[] data = new int[] {1, 2, 3};
        int element = 3;
        int result = FindLoop.indexOf(data, element);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[] {1, 2, 5};
        int element = 10;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenDiapasonHas8ThenResultEqualFinish() {
        int[] data = {5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int element = 8;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenDiapasonHasSomeEqualElementThen3() {
        int[] data = {5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        int element = 4;
        int start = 1;
        int finish = 8;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenDiapasonHas2Then3() {
        int[] data = {5, 2, 10, 2, 4};
        int element = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenDiapasonHasNot8ThenMinus1() {
        int[] data = {8, 2, 3, 4, 9, 10, 11};
        int element = 8;
        int start = 1;
        int finish = 5;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenDiapasonHas1ThenResultEqualStart() {
        int[] data = {1, 2, 3, 4, 5, 6};
        int element = 1;
        int start = 0;
        int finish = 3;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

}