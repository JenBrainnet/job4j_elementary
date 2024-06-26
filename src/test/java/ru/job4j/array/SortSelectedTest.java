package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {

    @Test
    void whenSortArrayWith5Elements() {
        int[] data = {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSortArrayWith3Elements() {
        int[] data = {3, 1, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = {1, 2, 3};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSortAlreadySortedArray() {
        int[] data = {1, 2, 3, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = {1, 2, 3, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSortArrayWithNegativeNumbers() {
        int[] data = {-1, -5, 0, -3, -8, -10};
        int[] result = SortSelected.sort(data);
        int[] expected = {-10, -8, -5, -3, -1, 0};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSortReverseSortedArray() {
        int[] data = {5, 4, 3, 2, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

}