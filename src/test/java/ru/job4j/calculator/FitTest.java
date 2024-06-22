package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69() {
        short in = 170;
        double expected = 69;
        double out = Fit.womanWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenManHeight187ThenWeight100dot05() {
        double expected = 100.05;
        short heightMan = 187;
        double out = Fit.manWeight(heightMan);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenManHeight170ThenWeight80dot5() {
        double expected = 80.5;
        short heightMan = 170;
        double out = Fit.manWeight(heightMan);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWomanHeight170ThenWeight69dot0() {
        double expected = 69.0;
        short heightWoman = 170;
        double out = Fit.womanWeight(heightWoman);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWomanHeight160ThenWeight57dot5() {
        double expected = 57.5;
        short heightWoman = 160;
        double out = Fit.womanWeight(heightWoman);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}