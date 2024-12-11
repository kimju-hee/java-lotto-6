package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.view.validation.PriceValidator;
import lotto.view.validation.WinningNumberValidator;

public class InputView {

    public String priceInput() {
        String purchasePrice = Console.readLine();
        PriceValidator.validator(purchasePrice);
        return purchasePrice;
    }

    public String winningInput() {
        String winningNumber = Console.readLine();
        WinningNumberValidator.validator(winningNumber);
        return winningNumber;
    }

}
