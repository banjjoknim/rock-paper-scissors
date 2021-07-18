package controller;

import models.enums.GameResults;
import models.enums.GameSelections;
import models.Game;
import service.GameService;
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

