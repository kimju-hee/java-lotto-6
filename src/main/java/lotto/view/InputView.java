package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.controller.LottoController;
import lotto.view.validation.BonusNumberValidator;
import lotto.view.validation.PriceValidator;
import lotto.view.validation.WinningNumberValidator;

public class InputView {
    private static LottoController lottoController = new LottoController();

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

    public String BonusInput() {
        String bonusNumber = Console.readLine();
        BonusNumberValidator.validator(lottoController, bonusNumber);
        return bonusNumber;
    }

}
