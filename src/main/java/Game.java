import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {

    private User user;
    private Computer computer;

    private Game(User user, Computer computer) {
        this.user = user;
        this.computer = computer;
    }

    private void printResult(GameResults result) {
        System.out.println("컴퓨터의 선택지 : " + computer.getSelection().getValue());
        System.out.println("유저의 선택지 : " + user.getSelection().getValue());
        System.out.println("결과 : " + result.getValue());
    }

    public static void main(String[] args) {
        System.out.println("가위 바위 보 게임을 시작합니다.");
        System.out.println("선택지를 입력해주세요. 가위 = 0, 바위 = 1, 보 = 2");
        Scanner sc = new Scanner(System.in);
        GameSelections userSelection = GameSelections.getGameSelection(sc.nextInt());
        GameSelections computerSelection = GameSelections.getGameSelection(GameSelections.makeSelection());
        User user = new User(userSelection);
        Computer computer = new Computer(computerSelection);
        Game game = new Game(user, computer);
        GameResults result = GameSelections.getGameResult(userSelection, computerSelection);
        game.printResult(result);
    }
}

