package lotto.controller;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;
import lotto.dto.Lotto;
import lotto.view.InputView;
import lotto.view.OutputView;
import lotto.view.handler.InputHandler;

public class LottoController {
    public static int purchasePrice;
    public static int lottoCount;

    List<List<Integer>> realLotto = new ArrayList<>();

    OutputView outputView = new OutputView();
    InputView inputView = new InputView();
    InputHandler inputHandler = new InputHandler(inputView);

    public void start() {
        purchaseLotto();
        setLottoCount();
        issuanceLotto();
    }

    public void purchaseLotto() {
        outputView.printPurchasePriceText();
        String price =  inputHandler.receiveValidPurchasePrice();
        purchasePrice = Integer.parseInt(price);
    }

    public void setLottoCount() {
        lottoCount = purchasePrice / 1000;
    }

    public int getLottoCount() {
        return lottoCount;
    }

    public void issuanceLotto() {
        for (int i = 0; i < lottoCount; i ++) {
            List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
            realLotto.add(numbers);
        }
    }

    public List<List<Integer>> getRealLotto() {
        return realLotto;
    }
}
