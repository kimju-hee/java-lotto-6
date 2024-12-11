package lotto.view.validation;

public class WinningNumberValidator {
    private static int MIN_NUMBER_LENGTH = 1;
    private static int MAX_NUMBER_LENGTH = 45;

    public static void validator(String input) {
        String[] parts = input.split(",");
        isNumeric(parts);
        isValidLength(parts);
        isValidRange(parts);
    }

    public static void isNumeric(String[] parts) {
        for (String part : parts) {
            if (!part.matches("\\d+")) {
                throwError();
            }
        }
    }

    public static void isValidLength(String[] parts) {
        if (parts.length != 6) {
            throwError2();
        }
    }

    public static void isValidRange(String[] parts) {
        for (String part : parts) {
            int p = Integer.parseInt(part);
            if (p < MIN_NUMBER_LENGTH || p > MAX_NUMBER_LENGTH) {
                throwError3();
            }
        }
    }

    private static void throwError() {
        throw new IllegalArgumentException(ErrorMessage.INVALID_WINNING_NUMBER.getMessage());
    }
    private static void throwError2() {
        throw new IllegalArgumentException(ErrorMessage.INVALID_WINNING_LENGTH.getMessage());
    }
    private static void throwError3() {
        throw new IllegalArgumentException(ErrorMessage.INVALID_WINNING_RANGE.getMessage());
    }
}