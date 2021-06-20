public class Computer {
    private GameSelections selection;

    public Computer(){
        int selection = (int) (Math.random() * 3);
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
