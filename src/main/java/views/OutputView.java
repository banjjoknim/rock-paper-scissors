package views;

import models.enums.GameResults;
import models.enums.GameSelections;
import models.Computer;
import models.User;

public class OutputView {
    public static void printGameStart() {
        System.out.println("가위 바위 보 게임을 시작합니다.");
        System.out.println("선택지를 입력해주세요. 가위 = 0, 바위 = 1, 보 = 2");
    }

    public static void printComputerSelections(Computer computer) {
        GameSelections computerSelection = computer.getSelection();
        System.out.println("컴퓨터의 선택지 : " + computerSelection.getSelections());
    }

    public static void printUserSelections(User user) {
        GameSelections userSelection = user.getSelection();
        System.out.println("유저의 선택지 : " + userSelection.getSelections());
    }

    public static void printGameResult(GameResults gameResults) {
        System.out.println("결과 : " + gameResults.getResults());
    }
}
