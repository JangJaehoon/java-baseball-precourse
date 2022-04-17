package baseball.exception;



public class LengthException extends IllegalArgumentException {

    private static String INVALID_LENGTH
            = "Please input 3 numbers.";

    public LengthException() {

        super(INVALID_LENGTH);
    }
}
