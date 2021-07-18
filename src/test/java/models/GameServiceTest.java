package models;

import models.enums.GameResults;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import service.GameService;

class GameServiceTest {
    Game gameDraw = GameService.makeGame(0, 0);
    Game gameLose = GameService.makeGame(0, 1);
    Game gameWin = GameService.makeGame(1, 0);

    @Test
    public void testMakeGame() {
        Assertions.assertThat(gameDraw).isInstanceOf(Game.class);
        Assertions.assertThat(gameDraw.getUser()).isInstanceOf(User.class);
        Assertions.assertThat(gameDraw.getComputer()).isInstanceOf(Computer.class);
    }

    @Test
    public void testGameStart() {
        Assertions.assertThat(GameService.gameStart(gameDraw))
                .isEqualTo(GameResults.DRAW);
        Assertions.assertThat(GameService.gameStart(gameLose))
                .isEqualTo(GameResults.LOSE);
        Assertions.assertThat(GameService.gameStart(gameWin))
                .isEqualTo(GameResults.WIN);
    }
}