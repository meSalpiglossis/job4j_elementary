package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Squre2() {
        int p = 6;
        int k = 2;
        int expected = 2;
        int out = (int) SqArea.square(p, k);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenP49K2dot5Square122dot5() {
        int p = 49;
        double k = 2.5;
        float expected = 122.5f;
        float out = (float) SqArea.square(p, k);
        assertThat(out).isCloseTo(expected, offset(0.01f));
    }

    @Test
    public void whenP8K1Square4() {
        int p = 8;
        double k = 1;
        double expected = 4;
        double out = SqArea.square(p, k);
        assertThat(out).isCloseTo(expected, offset(0.01));
    }
}