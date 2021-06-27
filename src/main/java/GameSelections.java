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

    public String value() {
        return selections;
    }
}
