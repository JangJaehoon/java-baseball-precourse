package baseball.exception;



public class RangeException extends IllegalArgumentException {

    private static final String INVALID_RANGE
            = "Please input from number 1 to number 9 : ";

    public RangeException() {

        super(INVALID_RANGE);
    }
}
