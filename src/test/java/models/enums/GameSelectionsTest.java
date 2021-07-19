package models.enums;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static models.enums.GameSelections.*;
import static models.enums.GameResults.*;
import static org.assertj.core.api.Assertions.*;

class GameSelectionsTest {

    @Test
    public void testGetValue() {
        assertThat(SCISSOR.getSelections()).isEqualTo("가위");
        assertThat(ROCK.getSelections()).isEqualTo("바위");
        assertThat(PAPER.getSelections()).isEqualTo("보");
    }

    @Test
    public void testGetGameSelection() {
        assertThat(getGameSelection(0))
                .isEqualTo(SCISSOR);
        assertThat(getGameSelection(1))
                .isEqualTo(ROCK);
        assertThat(getGameSelection(2))
                .isEqualTo(PAPER);
    }

    @ParameterizedTest
    @MethodSource("provideWrongNumberForGameSelection")
    public void testGetWrongGameSelection(int selectNumber) {
        assertThatThrownBy(() -> getGameSelection(selectNumber))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("올바른 선택지가 아닙니다.");
    }

    private static Stream<Arguments> provideWrongNumberForGameSelection() {
        return Stream.of(
                Arguments.of(-1111),
                Arguments.of(-1),
                Arguments.of(3),
                Arguments.of(4),
                Arguments.of(1111)
        );
    }

    @Test
    public void testGetGameResult() {
        assertThat(SCISSOR.makeGameResult(SCISSOR))
                .isEqualTo(DRAW);
        assertThat(ROCK.makeGameResult(ROCK))
                .isEqualTo(DRAW);
        assertThat(PAPER.makeGameResult(PAPER))
                .isEqualTo(DRAW);
        assertThat(SCISSOR.makeGameResult(ROCK))
                .isEqualTo(LOSE);
        assertThat(ROCK.makeGameResult(PAPER))
                .isEqualTo(LOSE);
        assertThat(PAPER.makeGameResult(SCISSOR))
                .isEqualTo(LOSE);
        assertThat(SCISSOR.makeGameResult(PAPER))
                .isEqualTo(WIN);
        assertThat(ROCK.makeGameResult(SCISSOR))
                .isEqualTo(WIN);
        assertThat(PAPER.makeGameResult(ROCK))
                .isEqualTo(WIN);
    }
}