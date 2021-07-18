package models.enums;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static models.enums.GameResults.*;

class GameResultsTest {
    @Test
    public void testGetResults() {
        Assertions.assertThat(LOSE.getValue()).isEqualTo("패배");
        Assertions.assertThat(DRAW.getValue()).isEqualTo("무승부");
        Assertions.assertThat(WIN.getValue()).isEqualTo("승리");
    }
}