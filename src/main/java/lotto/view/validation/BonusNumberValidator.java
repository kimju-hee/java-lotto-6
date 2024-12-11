package lotto.view.validation;

import java.util.List;
import lotto.controller.LottoController;

public class BonusNumberValidator {
    private static int MIN_NUMBER_LENGTH = 1;
    private static int MAX_NUMBER_LENGTH = 45;

    public static void validator(LottoController lottoController, String input) {
        isNumberic(input);
        validNumberRange(input);
        validNumberRange(input);
        notInWinningNumber(lottoController, input);
    }

    public static void isNumberic(String input) {
        if (!input.matches("\\d+")) {
            throwError();
        }
    }

    public static void validNumberRange(String input) {
        int num = Integer.parseInt(input);
        if (num < MIN_NUMBER_LENGTH || num > MAX_NUMBER_LENGTH) {
            throwError2();
        }
    }

    public static void notInWinningNumber(LottoController lottoController, String input) {
        List<Integer> num = lottoController.getWinningNumber();
        if (num.contains(Integer.parseInt(input))) {
            throwError3();
        }
    }

    private static void throwError() {
        throw new IllegalArgumentException(ErrorMessage.INVALID_BONUS.getMessage());
    }
    private static void throwError2() {
        throw new IllegalArgumentException(ErrorMessage.INVALID_BONUS_RANGE.getMessage());
    }
    private static void throwError3() {
        throw new IllegalArgumentException(ErrorMessage.INVALID_BONUS_NUMBER.getMessage());
    }
}
