package models.enums;

import org.junit.jupiter.api.Test;

import static models.enums.GameResults.*;
import static org.assertj.core.api.Assertions.*;

class GameResultsTest {
    @Test
    public void testGetResults() {
        assertThat(LOSE.getResults()).isEqualTo("패배");
        assertThat(DRAW.getResults()).isEqualTo("무승부");
        assertThat(WIN.getResults()).isEqualTo("승리");
    }
}