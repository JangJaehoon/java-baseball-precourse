package baseball.exception;



public class InfoFormatException extends IllegalArgumentException {

    private static final String INVALID_FORMAT
            = "Invalid inputs. Please input 1 or 2.";

    public InfoFormatException() {
        super(INVALID_FORMAT);
    }
}
