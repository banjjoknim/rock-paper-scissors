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

    public String getValue() {
        return selections;
    }

    public static GameSelections getGameSelection(int selectNumber){
        if(selectNumber==0){
            return SCISSOR;
        }
        if(selectNumber==1){
            return ROCK;
        }
        return PAPER;
    }

    public static int makeSelection() {
        return (int) (Math.random() * 3);
    }

    public static GameResults getGameResult(GameSelections userSelect, GameSelections computerSelect){
        if (userSelect == computerSelect) {
            return GameResults.DRAW;
        }
        if ((userSelect == SCISSOR && computerSelect == PAPER)
                || (userSelect == ROCK && computerSelect == SCISSOR)
                || (userSelect == PAPER && computerSelect == ROCK)) {
            return GameResults.WIN;
        }
        return GameResults.LOSE;
    }
}
