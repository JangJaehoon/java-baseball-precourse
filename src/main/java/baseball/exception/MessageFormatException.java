package baseball.exception;



public class MessageFormatException extends IllegalArgumentException {

    private static final String INVALID_CONTINUE_MESSAGE_FORMAT = "잘못 된 입력입니다. (1또는 2를 입력해야 합니다.)";

    public MessageFormatException() {
        super(INVALID_CONTINUE_MESSAGE_FORMAT);
    }
}