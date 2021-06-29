package enums;

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

    public static GameSelections getGameSelection(int selectNumber) {
        if (selectNumber == SCISSOR.selectNumber) {
            return SCISSOR;
        }
        if (selectNumber == ROCK.selectNumber) {
            return ROCK;
        }
        if(selectNumber == PAPER.selectNumber) {
            return PAPER;
        }
        throw new RuntimeException("올바른 선택지가 아닙니다.");
    }

    public static int makeSelection() {
        return (int) (Math.random() * 3);
    }

    public static GameResults getGameResult(GameSelections userSelect, GameSelections computerSelect) {
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
