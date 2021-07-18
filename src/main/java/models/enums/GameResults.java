package models.enums;

public enum GameResults {
    LOSE("패배"), DRAW("무승부"), WIN("승리");

    private final String results;

    GameResults(String results) {
        this.results = results;
    }

    public String getResults() {
        return results;
    }
}
