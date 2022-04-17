package baseball.exception;



public class RangeException extends IllegalArgumentException {

    private static final String INVALID_BASEBALL_NUMBER_RANGE = "1 ~ 9 사이의 값을 입력해야 합니다.";

    public RangeException() {
        super(INVALID_BASEBALL_NUMBER_RANGE);
    }
}