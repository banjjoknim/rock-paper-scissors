package views;

import java.util.Scanner;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputUserSelect() {
        return scanner.nextInt();
    }
}
