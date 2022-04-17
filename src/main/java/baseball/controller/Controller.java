package baseball.controller;

import baseball.domain.BaseBallNumbers;
import baseball.domain.RandomNum;
import baseball.exception.MessageFormatException;
import baseball.view.InputView;
import baseball.view.ResultView;

public class Controller {

    private static final String CONTINUE = "1";
    private static final String GAME_END = "2";
    private static final Integer THREE_STRIKE = 3;

    public static void run() {
        runBaseBallGame();
        checkContinue();
    }

    private static void runBaseBallGame() {
        int strCnt = 0;
        int ballCnt = 0;

        RandomNum randomNumbers = new RandomNum();
        while (strCnt != THREE_STRIKE) {
            BaseBallNumbers baseBallNumbers = new BaseBallNumbers(InputView.inputNum());
            ballCnt = baseBallNumbers.calculateBallCount(randomNumbers.randomNumbers());
            strCnt = baseBallNumbers.calculateStrikeCount(randomNumbers.randomNumbers());
            ResultView.printResult(ballCnt, strCnt);
        }
        ResultView.printResultInfoMessage();
    }

    private static void checkContinue() {
        String continueMessage = InputView.askContinue();

        if (continueMessage.equals(CONTINUE)) {
            runBaseBallGame();
            return;
        }

        if (continueMessage.equals(GAME_END)) {
            ResultView.printGameEnd();
            return;
        }

        throw new MessageFormatException();
    }
}
