package ru.job4j.junit;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.*;

@Disabled("Need to fix impl")
class JUnitExampleTest {
    @Test
    public void whenEquals() {
        int result = 1;
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFloatPoint() {
        float result = 1.0000001F;
        float expected = 1F;
        assertThat(result).isCloseTo(expected, offset(0.01F));
    }

    @Test
    public void whenArray() {
        int[] result = {1, 2, 3};
        int[] expected = {1, 2, 3};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void when5and5then25() {
        JUnitExample example = new JUnitExample();
        int result = example.multiply(5, 5);
        assertThat(result).isEqualTo(25);
    }

    @RepeatedTest(2)
    void when2and2then4() {
        JUnitExample example = new JUnitExample();
        int result = example.multiply(2, 2);
        assertThat(result).isEqualTo(4);
    }

    @Test
    @DisplayName("When 3 multi 3 should be 9")
    void when3and3then9() {
        JUnitExample example = new JUnitExample();
        int result = example.multiply(3,  3);
        assertThat(result).isEqualTo(9);
    }

    @Disabled
    @Test
    void when4and4then16() {
        JUnitExample example = new JUnitExample();
        int result = example.multiply(4, 4);
        assertThat(result).isEqualTo(16);
    }

    @Timeout(3)
    @Test
    void when6and6then36() throws InterruptedException {
        Thread.sleep(5000);
        JUnitExample example = new JUnitExample();
        int result = example.multiply(6, 6);
        assertThat(result).isEqualTo(36);
    }

    @Timeout(value = 5000, unit = TimeUnit.MILLISECONDS)
    @Test
    void when7and7then49() throws InterruptedException {
        Thread.sleep(3000);
        JUnitExample example = new JUnitExample();
        int result = example.multiply(7, 7);
        assertThat(result).isEqualTo(49);
    }
}