package baseball.domain;


import baseball.exception.RangeException;
import java.util.Objects;

public class Number {
    private static final Integer MINIMUM = 1;
    private static final Integer MAXIMUM = 9;
    private final int Numbers;

    public Number(Character number) {
        this(Character.getNumericValue(number));
    }

    public Number(String number) {
        this(Integer.parseInt(number));
    }

    public Number(Integer number) {
        validateNum(number);
        this.Numbers = number;
    }

    private void validateNum(Integer number) {
        if (MINIMUM > number || MAXIMUM < number) {
            throw new RangeException();
        }
    }

    public int getBaseballNumber() {
        return Numbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Number that = (Number) o;
        return Numbers == that.Numbers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Numbers);
    }
}
