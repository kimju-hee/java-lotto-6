package lotto.view.validation;

public enum ErrorMessage {
    INVALID_PURCHASE("구매 금액은 1000원 단위어야 합니다"),
    INVALID_PURCHASE_NUMBER("구매 금액은 숫자여야 합니다."),
    INVALID_WINNING_LENGTH("당첨 번호는 6자리여야 합니다"),
    INVALID_WINNING_NUMBER("당첨 번호는 숫자여야 합니다"),
    INVALID_WINNING_RANGE("당첨 번호는 1~45 사이의 숫자여야 합니다");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
