package baseball.domain;

import baseball.exception.LengthException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class GameNums {
    private static final int START = 0;
    private static final int END = 2;
    private static final int nums_length = 3;
    private static List<Number> userBNums;

    public GameNums(String userNums) {
        validatelength(userNums);
        this.userBNums = convertNumFormat(userNums);
    }

    private List<Number> convertNumFormat(String userNums) {
        List<Number> userNumList = new ArrayList<>();
        for (int i = 0; i < userNums.length(); i++) {
            userNumList.add(new Number(userNums.charAt(i) ) );
        }
        return userNumList;
    }

    private void validatelength(String userNums) {
        if (userNums.length() != nums_length) {
            throw new LengthException();
        }
    }

    public int BallCount(List<Number> randomNums) {
        return (int) IntStream.rangeClosed(START, END).filter(i -> isBall(i, randomNums)).count();
    }

    private boolean isBall(int targetIndex, List<Number> randomNums) {
        Number randomNum = randomNums.get(targetIndex);
        Number userNum = userBNums.get(targetIndex);
        return !randomNum.equals(userNum) && contains(randomNum);
    }

    public int StrikeCount(List<Number> randomNumbers) {
        return (int) IntStream.rangeClosed(START, END).
                filter(i -> isStrike(i, randomNumbers)).count();
    }

    private boolean isStrike(int targetIndex, List<Number> randomNums) {
        Number randomNum = randomNums.get(targetIndex);
        Number userNum = userBNums.get(targetIndex);
        return randomNum.equals(userNum);
    }

    public boolean contains(Number compareNum) {
        return userBNums.stream()
                .anyMatch(baseBallNumber -> baseBallNumber.equals(compareNum) );
    }
}
