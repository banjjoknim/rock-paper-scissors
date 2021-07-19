package models.enums;

public enum GameSelections {
    SCISSOR(0, "가위"),
    ROCK(1, "바위"),
    PAPER(2, "보");

    private final int selectNumber;
    private final String selections;

    GameSelections(int selectNumber, String selections) {
        this.selectNumber = selectNumber;
        this.selections = selections;
    }

    public static GameSelections getGameSelection(int selectNumber) {
        for (GameSelections gameSelections : GameSelections.values()) {
            if (gameSelections.selectNumber == selectNumber) {
                return gameSelections;
            }
        }
        throw new IllegalArgumentException("올바른 선택지가 아닙니다.");
    }

    public GameResults makeGameResult(GameSelections computerSelect) {
        if (this == computerSelect) {
            return GameResults.DRAW;
        }
        if ((this == SCISSOR && computerSelect == PAPER)
                || (this == ROCK && computerSelect == SCISSOR)
                || (this == PAPER && computerSelect == ROCK)) {
            return GameResults.WIN;
        }
        return GameResults.LOSE;
    }

    public String getSelections() {
        return selections;
    }
}
