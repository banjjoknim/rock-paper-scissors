package controller;

import models.Computer;
import models.Random;
import models.User;
import models.enums.GameResults;
import models.enums.GameSelections;
import models.Game;
import views.InputView;
import views.OutputView;

public class GameController {
    public static void gameRun() {
        OutputView.printGameStart();
        GameSelections userSelection = GameSelections.getGameSelection(InputView.inputUserSelect());
        User user = new User(userSelection);
        GameSelections computerSelection = GameSelections.getGameSelection(Random.makeRandomNumber(3));
        Computer computer = new Computer(computerSelection);
        Game game = new Game(user, computer);
        OutputView.printComputerSelections(game.getComputer());
        OutputView.printUserSelections(game.getUser());
        OutputView.printGameResult(game.findResult());
    }
}

