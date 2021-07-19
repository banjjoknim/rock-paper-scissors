package models;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RandomTest {
    @Test
    public void testMakeRandomNumber() {
        assertThat(Random.makeRandomNumber(3))
                .isGreaterThanOrEqualTo(0)
                .isLessThan(3);
    }
}