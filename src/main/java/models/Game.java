package models;

import models.enums.GameResults;
import models.enums.GameSelections;

public class Game {
    private User user;
    private Computer computer;

    public Game(User user, Computer computer) {
        this.user = user;
        this.computer = computer;
    }

    public GameResults findResult() {
        GameSelections userGameSelection = this.user.getSelection();
        GameSelections computerGameSelection = this.computer.getSelection();
        return userGameSelection.makeGameResult(computerGameSelection);
    }

    public User getUser() {
        return this.user;
    }

    public Computer getComputer() {
        return this.computer;
    }
}
