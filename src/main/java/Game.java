import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class User{
    int select;

    public User(int select) {
        this.select = select;
    }
}

class Computer{
    int select;

    public Computer(){
        this.select = (int) (Math.random() * 3);
    }
}

public class Game {
    public static List<String> GAMESELECT = Arrays.asList("가위", "바위", "보");
    public static List<String> GAMERESULT = Arrays.asList("패배", "무승부", "승리");

    private User user;
    private Computer computer;

    public Game(int userSelect) {
        this.user = new User(userSelect);
        this.computer = new Computer();
    }

    public int gameStart() {
        int userSelect = user.select;
        int computerSelect = computer.select;
        if (userSelect == computerSelect) {
            return 1;
        }
        if ((userSelect == 0 && computerSelect == 2) || (userSelect == 1 && computerSelect == 0) || (userSelect == 2 && computerSelect == 1)) {
            return 2;
        }
        return 0;
    }

    public void printResult(int result) {
        int userSelect = user.select;
        int computerSelect = computer.select;
        System.out.println("컴퓨터의 선택지 : " + GAMESELECT.get(computerSelect));
        System.out.println("유저의 선택지 : " + GAMESELECT.get(userSelect));
        System.out.println("결과 : " + GAMERESULT.get(result));
    }

    public static void main(String[] args) {
        System.out.println("가위 바위 보 게임을 시작합니다.");
        System.out.println("선택지를 입력해주세요. 가위 = 0, 바위 = 1, 보 = 2");
        Scanner sc = new Scanner(System.in);
        Game game = new Game(sc.nextInt());
        int result = game.gameStart();
        game.printResult(result);
    }
}

