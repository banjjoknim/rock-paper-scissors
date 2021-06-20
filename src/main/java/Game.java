import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {

    private User user;
    private Computer computer;

    private Game(User user) {
        this.user = user;
        this.computer = new Computer();
    }

    private GameResults gameStart() {
        GameSelections userSelect = user.getSelection();
        GameSelections computerSelect = computer.getSelection();
        if (userSelect == computerSelect) {
            return GameResults.DRAW;
        }
        if ((userSelect == GameSelections.SCISSOR && computerSelect == GameSelections.PAPER)
                || (userSelect == GameSelections.ROCK && computerSelect == GameSelections.SCISSOR)
                || (userSelect == GameSelections.PAPER && computerSelect == GameSelections.ROCK)) {
            return GameResults.WIN;
        }
        return GameResults.LOSE;
    }

    private void printResult(GameResults result) {
        System.out.println("컴퓨터의 선택지 : " + computer.getSelectionValue());
        System.out.println("유저의 선택지 : " + user.getSelectionValue());
        System.out.println("결과 : " + result.value());
    }

    public static void main(String[] args) {
        System.out.println("가위 바위 보 게임을 시작합니다.");
        System.out.println("선택지를 입력해주세요. 가위 = 0, 바위 = 1, 보 = 2");
        Scanner sc = new Scanner(System.in);
        User user = new User(sc.nextInt());
        Game game = new Game(user);
        GameResults result = game.gameStart();
        game.printResult(result);
    }
}

