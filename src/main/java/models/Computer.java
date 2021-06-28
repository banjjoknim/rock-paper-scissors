package models;

import enums.GameSelections;

public class Computer {
    private GameSelections selection;

    public Computer(GameSelections selection) {
        this.selection = selection;
    }

    public GameSelections getSelection() {
        return selection;
    }

}
