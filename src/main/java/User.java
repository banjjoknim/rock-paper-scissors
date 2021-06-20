public class User {
    private GameSelections selection;

    public User(int selection) {
        switch(selection) {
            case 0:
                this.selection = GameSelections.SCISSOR;
                break;
            case 1:
                this.selection = GameSelections.ROCK;
                break;
            case 2:
                this.selection = GameSelections.PAPER;
                break;
        }
    }

    public GameSelections getSelection(){
        return selection;
    }

    public String getSelectionValue(){
        return selection.value();
    }
}
