package models.enums;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static models.enums.GameSelections.*;
import static models.enums.GameResults.*;

class GameSelectionsTest {

    @Test
    public void testGetValue() {
        Assertions.assertThat(SCISSOR.getSelections()).isEqualTo("가위");
        Assertions.assertThat(ROCK.getSelections()).isEqualTo("바위");
        Assertions.assertThat(PAPER.getSelections()).isEqualTo("보");
    }

    @Test
    public void testGetGameSelection() {
        Assertions.assertThat(getGameSelection(0))
                .isEqualTo(SCISSOR);
        Assertions.assertThat(getGameSelection(1))
                .isEqualTo(ROCK);
        Assertions.assertThat(getGameSelection(2))
                .isEqualTo(PAPER);
    }

    @ParameterizedTest
    @ValueSource(ints = {-2, -1, 3, 4})
    public void testGetWrongGameSelection(int selectNumber) {
        Assertions.assertThatThrownBy(() -> getGameSelection(selectNumber))
                .isInstanceOf(RuntimeException.class)
                .hasMessage("올바른 선택지가 아닙니다.");
    }

    @Test
    public void testMakeSelection() {
        Assertions.assertThat(makeSelection())
                .isGreaterThanOrEqualTo(0)
                .isLessThan(3);
    }

    @Test
    public void testGetGameResult() {
        Assertions.assertThat(SCISSOR.makeGameResult(SCISSOR))
                .isEqualTo(DRAW);
        Assertions.assertThat(ROCK.makeGameResult(ROCK))
                .isEqualTo(DRAW);
        Assertions.assertThat(PAPER.makeGameResult(PAPER))
                .isEqualTo(DRAW);
        Assertions.assertThat(SCISSOR.makeGameResult(ROCK))
                .isEqualTo(LOSE);
        Assertions.assertThat(ROCK.makeGameResult(PAPER))
                .isEqualTo(LOSE);
        Assertions.assertThat(PAPER.makeGameResult(SCISSOR))
                .isEqualTo(LOSE);
        Assertions.assertThat(SCISSOR.makeGameResult(PAPER))
                .isEqualTo(WIN);
        Assertions.assertThat(ROCK.makeGameResult(SCISSOR))
                .isEqualTo(WIN);
        Assertions.assertThat(PAPER.makeGameResult(ROCK))
                .isEqualTo(WIN);
    }
}