package views;

import enums.GameResults;
import enums.GameSelections;

public class OutputView {
    public static void printGameStart() {
        System.out.println("가위 바위 보 게임을 시작합니다.");
        System.out.println("선택지를 입력해주세요. 가위 = 0, 바위 = 1, 보 = 2");
    }

    public static void printGameSelections(GameSelections userSelect, GameSelections computerSelect) {
        System.out.println("컴퓨터의 선택지 : " + computerSelect.getValue());
        System.out.println("유저의 선택지 : " + userSelect.getValue());
    }

    public static void printGameResult(GameResults gameResults) {
        System.out.println("결과 : " + gameResults.getValue());
    }
}
