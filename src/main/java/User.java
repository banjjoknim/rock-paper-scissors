public class User {
    private GameSelections selection;

    public User(GameSelections selection) {
        this.selection = selection;
    }

    public GameSelections getSelection(){
        return selection;
    }

    public String getSelectionValue(){
        return selection.value();
    }
}
