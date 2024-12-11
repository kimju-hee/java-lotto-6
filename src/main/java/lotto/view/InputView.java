package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.view.validation.PriceValidator;

public class InputView {

    public String priceInput() {
        String purchasePrice = Console.readLine();
        PriceValidator.validator(purchasePrice);
        return purchasePrice;
    }

}
