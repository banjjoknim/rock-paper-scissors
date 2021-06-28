package models;

import enums.GameResults;
import enums.GameSelections;

public class GameService {
    public static Game makeGame(int userSelect, int computerSelect) {
        GameSelections userSelection = GameSelections.getGameSelection(userSelect);
        User user = new User(userSelection);
        GameSelections computerSelection = GameSelections.getGameSelection(computerSelect);
        Computer computer = new Computer(computerSelection);
        return new Game(user, computer);
    }

    public static GameResults gameStart(Game game) {
        User user = game.getUser();
        Computer computer = game.getComputer();
        return GameSelections.getGameResult(user.getSelection(), computer.getSelection());
    }
}