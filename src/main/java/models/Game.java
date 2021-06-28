package models;

public class Game {
    private User user;
    private Computer computer;

    public Game(User user, Computer computer) {
        this.user = user;
        this.computer = computer;
    }

    public User getUser() {
        return this.user;
    }

    public Computer getComputer() {
        return this.computer;
    }
}
