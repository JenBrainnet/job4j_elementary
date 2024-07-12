package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 0);
        double result = p1.distance(p2);
        double expected = 2;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when20to00then2() {
        Point p1 = new Point(2, 0);
        Point p2 = new Point(0, 0);
        double result = p1.distance(p2);
        double expected = 2;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus10000minus1to11then10001() {
        Point p1 = new Point(-10000, -1);
        Point p2 = new Point(1, 1);
        double result = p1.distance(p2);
        double expected = 10001;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when15toMinus1minus5then10dot19() {
        Point p1 = new Point(1, 5);
        Point p2 = new Point(-1, -5);
        double result = p1.distance(p2);
        double expected = 10.19;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenDistance3dFromX1Y2Z3toX4Y6Z8Then7dot07() {
        Point p1 = new Point(1, 2, 3);
        Point p2 = new Point(4, 6, 8);
        double result = p1.distance3d(p2);
        double expected = 7.07;
        assertThat(result).isCloseTo(expected, withPrecision(0.01));
    }

    @Test
    void whenDistance3dFromX0Y0Z0toX1Y1Z1Then1dot73() {
        Point p1 = new Point(0, 0, 0);
        Point p2 = new Point(1, 1, 1);
        double result = p1.distance3d(p2);
        double expected = 1.73;
        assertThat(result).isCloseTo(expected, withPrecision(0.01));
    }

    @Test
    void whenDistance3dFromNeg1Neg2Neg3ToNeg4Neg6Neg8Then7dot07() {
        Point p1 = new Point(-1, -2, -3);
        Point p2 = new Point(-4, -6, -8);
        double result = p1.distance3d(p2);
        double expected = 7.07;
        assertThat(result).isCloseTo(expected, withPrecision(0.01));
    }

}