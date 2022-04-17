package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomNum {
    private static final int START = 1;
    private static final int END = 9;
    private static final int COUNT = 3;

    private static List<Number> randomNums;

    public RandomNum() {
        this.randomNums = extractRandomNums();
    }

    private List<Number> extractRandomNums() {
        List<Number> randomNums = new ArrayList<>();

        while (randomNums.size() != COUNT) {
            Number randomNum =
                    new Number(Randoms.pickNumberInRange(START, END));
            if (!randomNums.contains(randomNum)) {
                randomNums.add(randomNum);
            }
        }
        return randomNums;
    }

    public List<Number> randomNumbers() {

        return Collections.unmodifiableList(randomNums);
    }
}
