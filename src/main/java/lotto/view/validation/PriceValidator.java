package lotto.view.validation;

public class PriceValidator {
    public static void validator(String input) {
        isNumberic(input);
        isValidNumber(input);
    }

    public static void isValidNumber(String input) {
        if (Integer.parseInt(input) % 1000 != 0) {
            throwError();
        }
    }

    public static void isNumberic(String input) {
        if (!input.matches("\\d+")) {
            throwError2();
        }
    }

    private static void throwError() {
        throw new IllegalArgumentException(ErrorMessage.INVALID_PURCHASE.getMessage());
    }
    private static void throwError2() {
        throw new IllegalArgumentException(ErrorMessage.INVALID_PURCHASE_NUMBER.getMessage());
    }
}
