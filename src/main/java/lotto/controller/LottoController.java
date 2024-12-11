package lotto.controller;

import lotto.view.InputView;
import lotto.view.OutputView;
import lotto.view.handler.InputHandler;

public class LottoController {
    public static int purchasePrice;

    OutputView outputView = new OutputView();
    InputView inputView = new InputView();
    InputHandler inputHandler = new InputHandler(inputView);

    public void start() {
        purchaseLotto();
    }

    public void purchaseLotto() {
        outputView.printPurchasePriceText();
        String price =  inputHandler.receiveValidPurchasePrice();
        purchasePrice = Integer.parseInt(price);
    }
}
