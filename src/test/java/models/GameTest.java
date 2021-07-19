package models;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static models.enums.GameSelections.*;
import static models.enums.GameResults.*;

class GameTest {
    User rockSelectUser = new User(ROCK);
    User scissorSelectUser = new User(SCISSOR);
    User paperSelectUser = new User(PAPER);

    Computer rockSelectComputer = new Computer(ROCK);
    Computer scissorSelectComputer = new Computer(SCISSOR);
    Computer paperSelectComputer = new Computer(PAPER);

    Game gameWin = new Game(rockSelectUser, scissorSelectComputer);
    Game gameDraw = new Game(paperSelectUser, paperSelectComputer);
    Game gameLose = new Game(scissorSelectUser, rockSelectComputer);

    @Test
    public void testFindResult() {
        assertThat(gameWin.findResult())
                .isEqualTo(WIN);
        assertThat(gameDraw.findResult())
                .isEqualTo(DRAW);
        assertThat(gameLose.findResult())
                .isEqualTo(LOSE);
    }

    @Test
    public void testGetUser() {
        assertThat(gameWin.getUser())
                .isEqualTo(rockSelectUser);
        assertThat(gameDraw.getUser())
                .isEqualTo(paperSelectUser);
        assertThat(gameLose.getUser())
                .isEqualTo(scissorSelectUser);
    }

    @Test
    public void testGetComputer() {
        assertThat(gameWin.getComputer())
                .isEqualTo(scissorSelectComputer);
        assertThat(gameDraw.getComputer())
                .isEqualTo(paperSelectComputer);
        assertThat(gameLose.getComputer())
                .isEqualTo(rockSelectComputer);
    }
}