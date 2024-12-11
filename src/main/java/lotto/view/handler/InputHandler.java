package lotto.view.handler;

import java.util.function.Supplier;
import lotto.view.ErrorView;
import lotto.view.InputView;

public class InputHandler {
    private final InputView inputView;

    public InputHandler(InputView inputView) {
        this.inputView = inputView;
    }

    public String receiveValidPurchasePrice() {
        return receiveValidatedInput(inputView::priceInput);
    }

    public String receiveValidWinningNumber() {
        return receiveValidatedInput(inputView::winningInput);
    }

    private <T> T receiveValidatedInput(Supplier<T> inputView) {
        while (true) {
            try {
                return inputView.get();
            } catch (IllegalArgumentException exception) {
                ErrorView.printErrorMessage(exception.getMessage());
            }
        }
    }
}
