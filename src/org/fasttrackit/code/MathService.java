package org.fasttrackit.code;

public class MathService {
    public static int getMaxNumber() {
        return 10000;
    }

    public static int computePower(int number, int power) throws PowerTooLargeException, NumberTooLargeException, NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("The number is negative and we don't like negativism in our life");
        }
        if (power > 10) {
            throw new PowerTooLargeException("The power is to big");
        }

        if (number > getMaxNumber()) {
            throw new NumberTooLargeException(number);
        }
        return (int) Math.pow(number, power);
    }
}
