package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax22To1Then22() {
        int left = 22;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 22;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To10Then10() {
        int left = 2;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}