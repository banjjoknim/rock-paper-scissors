package models.enums;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static models.enums.GameResults.*;

class GameResultsTest {
    @Test
    public void testGetResults() {
        Assertions.assertThat(LOSE.getResults()).isEqualTo("패배");
        Assertions.assertThat(DRAW.getResults()).isEqualTo("무승부");
        Assertions.assertThat(WIN.getResults()).isEqualTo("승리");
    }
}