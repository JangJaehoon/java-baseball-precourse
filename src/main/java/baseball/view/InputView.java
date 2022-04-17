package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String inputNum() {
        System.out.printf("Input your numbers : ");
        return Console.readLine();
    }

    public static String askContinue() {
        System.out.println(" Restart : 1, End : 2 ");
        return Console.readLine();
    }
}