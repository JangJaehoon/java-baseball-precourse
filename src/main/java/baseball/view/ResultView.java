package baseball.view;

public class ResultView {

    private static final String GAME_END = "Game Over"; // 게임 종료
    private static final String CLEAR = "Your input of 3 numbers are all correct answers! Game Over";
    private static final String STATE_FORMAT = "%d%s ";
    private static final String BALL = "ball";
    private static final String STRIKE = "strike";
    private static final String NOTHING = "nothing";


    public static void printResult(int ballCnt, int strikeCnt) {
        printBall(ballCnt);
        printStrike(strikeCnt);
        printNothing(ballCnt, strikeCnt);
        System.out.println();
    }

    public static void printResult() {

        System.out.println(CLEAR);
    }

    public static void printEnd() {

        System.out.println(GAME_END);
    }

    private static void printNothing(int ballCount, int strikeCount) {
        if (ballCount == 0 && strikeCount == 0) {
            System.out.print(NOTHING);
        }
    }

    private static void printStrike(int strikeCount) {
        if (strikeCount != 0) {
            System.out.printf(STATE_FORMAT, strikeCount, STRIKE);
        }
    }

    private static void printBall(int ballCount) {
        if (ballCount != 0) {
            System.out.printf(STATE_FORMAT, ballCount, BALL);
        }
    }
}
