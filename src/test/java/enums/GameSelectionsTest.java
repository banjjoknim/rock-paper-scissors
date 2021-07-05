package enums;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static enums.GameSelections.*;
import static enums.GameResults.*;

class GameSelectionsTest {

    @Test
    public void testGetValue() {
        Assertions.assertThat(SCISSOR.getValue()).isEqualTo("가위");
        Assertions.assertThat(ROCK.getValue()).isEqualTo("바위");
        Assertions.assertThat(PAPER.getValue()).isEqualTo("보");
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
        Assertions.assertThat(getGameResult(SCISSOR, SCISSOR))
                .isEqualTo(DRAW);
        Assertions.assertThat(getGameResult(ROCK, ROCK))
                .isEqualTo(DRAW);
        Assertions.assertThat(getGameResult(PAPER, PAPER))
                .isEqualTo(DRAW);
        Assertions.assertThat(getGameResult(SCISSOR, ROCK))
                .isEqualTo(LOSE);
        Assertions.assertThat(getGameResult(ROCK, PAPER))
                .isEqualTo(LOSE);
        Assertions.assertThat(getGameResult(PAPER, SCISSOR))
                .isEqualTo(LOSE);
        Assertions.assertThat(getGameResult(SCISSOR, PAPER))
                .isEqualTo(WIN);
        Assertions.assertThat(getGameResult(ROCK, SCISSOR))
                .isEqualTo(WIN);
        Assertions.assertThat(getGameResult(PAPER, ROCK))
                .isEqualTo(WIN);
    }
}