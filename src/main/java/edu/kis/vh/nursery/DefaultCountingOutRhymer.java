package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static int NUMBERS_SIZE = 12;

	private static int ERROR_CODE = -1;

	private int[] numbers = new int[NUMBERS_SIZE];

    public int total = ERROR_CODE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == ERROR_CODE;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_CODE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_CODE;
        return numbers[total--];
    }

}
