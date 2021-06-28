package controller;

import enums.GameResults;
import enums.GameSelections;
import models.Computer;
import models.User;
import views.InputView;
import views.OutputView;

import java.util.Scanner;

public class GameController {
    public static void gameRun() {
        OutputView.printGameStart();
        int userSelect = InputView.getInput();
        GameSelections userSelection = GameSelections.getGameSelection(userSelect);
        int computerSelect = GameSelections.makeSelection();
        GameSelections computerSelection = GameSelections.getGameSelection(computerSelect);
        GameResults result = GameSelections.getGameResult(userSelection, computerSelection);
        OutputView.printGameSelections(userSelection, computerSelection);
        OutputView.printGameResult(result);
    }
}

