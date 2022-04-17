package baseball.controller;

import baseball.domain.GameNums;
import baseball.domain.RandomNum;
import baseball.exception.InfoFormatException;
import baseball.view.InputView;
import baseball.view.ResultView;

public class Controller {

    private static final String CONTINUE = "1";
    private static final String END = "2";
    private static final Integer THREE_STRIKE = 3;

    public static void run() {
        runGame();
        checkContinue();
    }

    private static void runGame() {
        int strCnt = 0;
        int ballCnt = 0;

        RandomNum randomNums = new RandomNum();
        while (strCnt != THREE_STRIKE) {
            GameNums gameNums = new GameNums(InputView.inputNum());
            ballCnt = gameNums.BallCount(randomNums.randomNumbers());
            strCnt = gameNums.StrikeCount(randomNums.randomNumbers());
            ResultView.printResult(ballCnt, strCnt);
        }
        ResultView.printResult();
    }

    private static void checkContinue() {
        String continueInfo = InputView.askContinue();

        if (continueInfo.equals(CONTINUE)) {
            runGame();
            return;
        }

        if (continueInfo.equals(END)) {
            ResultView.printEnd();
            return;
        }

        throw new InfoFormatException();
    }
}
