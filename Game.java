import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Game {

    public Game() {

    }

    public int play(){
        Random random = new Random();
        int result = random.nextInt(2);
        return result;
    }

    public String compare(int user, int computer){
        if(user==computer) return "결과 : 무승부";
        else if(Math.abs(computer-user)==2) {
            if(user>computer) return "결과 : 패배";
            else return "결과 : 승리";
        }
        else if(Math.abs(computer-user)==1) {
            if(user>computer) return "결과 : 승리";
            else return "결과 : 패배";
        }
        else return "잘못된 정보입니다.";
    }

    public String computer(int computer){
        if(computer == 0) return "바위";
        else if(computer == 1) return "보";
        else if(computer == 2) return "가위";
        else return "오류입니다.";
    }

    public String user(int user){
        if(user == 0) return "바위";
        else if(user == 1) return "보";
        else if(user == 2) return "가위";
        else return "오류입니다.";
    }

    public static void main(String[] args) {
        System.out.println("가위 바위 보 게임을 시작합니다.");
        System.out.println("선택지를 입력해주세요. 바위 = 0, 보 = 1, 가위 = 2");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Game game = new Game();
        String input;
        int computer;
        int user;
        String result;
        try {
            input = reader.readLine();
            user = Integer.parseInt(input);
            if (user < 0) System.out.println("잘못된 요청입니다.");
            else{
                computer = game.play();
                result = game.compare(user,computer);
                System.out.println("컴퓨터의 선택지 : "+ game.computer(computer));
                System.out.println("유저의 선택지 : " + game.user(user));
                System.out.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
