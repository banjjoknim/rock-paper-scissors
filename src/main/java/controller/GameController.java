package controller;

import enums.GameResults;
import enums.GameSelections;
import models.Game;
import models.GameService;
import views.InputView;
import views.OutputView;

public class GameController {
    public static void gameRun() {
        OutputView.printGameStart();
        int userSelect = InputView.getInput();
        int computerSelect = GameSelections.makeSelection();
        Game game = GameService.makeGame(userSelect, computerSelect);
        OutputView.printComputerSelections(game.getComputer());
        OutputView.printUserSelections(game.getUser());
        GameResults result = GameService.gameStart(game);
        OutputView.printGameResult(result);
    }
}

