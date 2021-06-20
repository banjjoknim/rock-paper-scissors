public enum GameSelections {
    SCISSOR("가위"), ROCK("바위"), PAPER("보");

    private final String selections;

    GameSelections(String selections) {
        this.selections = selections;
    }

    public String value() {
        return selections;
    }
}
