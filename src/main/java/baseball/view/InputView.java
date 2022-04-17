package baseball.view;


import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String inputNum() {
        System.out.printf("숫자를 입력해 주세요 : ");
        return Console.readLine();
    }

    public static String askContinue() {
        System.out.println(" 재시작은 1, 종료는 2를 입력해 주세요.");
        return Console.readLine();
    }
}