package constant;

public enum ConstantNumber {
    MINIMUM_WINNING_NUMBER(1),
    MAXIMUM_WINNING_NUMBER(45),
    WINNING_NUMBER_COUNT(6)
    ;

    private final int number;

    ConstantNumber(int number) {
        this.number = number;
    }

    public int get() {
        return number;
    }
}