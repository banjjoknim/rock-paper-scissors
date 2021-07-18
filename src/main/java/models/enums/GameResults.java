package models.enums;

public enum GameResults {
    LOSE("패배"), DRAW("무승부"), WIN("승리");

    private String results;

    GameResults(String results) {
        this.results = results;
    }

    public String getValue() {
        return results;
    }
}
