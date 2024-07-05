package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SimpleStringEncoderTest {

    @Test
    void whenOnlyOne() {
        String input = "a";
        String result = SimpleStringEncoder.encode(input);
        String expected = "a";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenDoubleA() {
        String input = "aa";
        String result = SimpleStringEncoder.encode(input);
        String expected = "a2";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStringaaabbcThenResulta3b2c() {
        String input = "aaabbc";
        String result = SimpleStringEncoder.encode(input);
        String expected = "a3b2c";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStringabbcccThenResultab2c3() {
        String input = "abbccc";
        String result = SimpleStringEncoder.encode(input);
        String expected = "ab2c3";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStringaaabccThenResulta3bc2() {
        String input = "aaabcc";
        String result = SimpleStringEncoder.encode(input);
        String expected = "a3bc2";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStringabcThenResultabc() {
        String input = "abc";
        String result = SimpleStringEncoder.encode(input);
        String expected = "abc";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStringaaabbbcccThenResulta3b3c3() {
        String input = "aaabbbccc";
        String result = SimpleStringEncoder.encode(input);
        String expected = "a3b3c3";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStringaaaaaaaaaaaabbbcddddThenResulta12b3cd4() {
        String input = "aaaaaaaaaaaabbbcdddd";
        String result = SimpleStringEncoder.encode(input);
        String expected = "a12b3cd4";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStringaaabbbbaaabbcccdddddThenResulta3b4a3b2c3d5() {
        String input = "aaabbbbaaabbcccddddd";
        String result = SimpleStringEncoder.encode(input);
        String expected = "a3b4a3b2c3d5";
        assertThat(result).isEqualTo(expected);
    }

}