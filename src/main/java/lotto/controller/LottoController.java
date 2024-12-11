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
    public static List<Integer> winningNumber = new ArrayList<>();
    public static int bonusNumber;
    public static int[] result = new int[8];

    List<List<Integer>> realLotto = new ArrayList<>();

    OutputView outputView = new OutputView();
    InputView inputView = new InputView();
    InputHandler inputHandler = new InputHandler(inputView);

    public void start() {
        purchaseLotto();
        setLottoCount();
        issuanceLotto();
        printIssuedLottoNumber();
        printWinningNumber();
        printBonusNumber();
        calculatePrice();
        printResult();
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

    public void printIssuedLottoNumber() {
        outputView.printIssuedText(lottoCount);
        for (int i = 0; i < lottoCount; i++) {
            outputView.printIssuedLotto(realLotto.get(i));
        }
    }

    public void printWinningNumber() {
        outputView.printWinningTextNumber();
        String[] winNumber = inputHandler.receiveValidWinningNumber().split(",");
        for (String num :winNumber) {
            winningNumber.add(Integer.parseInt(num));
        }
    }

    public List<Integer> getWinningNumber() {
        return winningNumber;
    }

    public void printBonusNumber() {
        outputView.printBonusNumberText();
        String num = inputHandler.receiveValidBonusNumber();
        bonusNumber = Integer.parseInt(num);
    }

    public int[] calculatePrice() {
        for (List<Integer> lotto : realLotto) {
            int count = 0;
            for (int win : winningNumber) {
                if (lotto.contains(win)) {
                    count += 1;
                }
            }
            if (count == 5) {
                if (lotto.contains(bonusNumber)) {
                    count += 2;
                }
            }
            result[count] += 1;
        } return result;
    }

    public void printResult() {
        outputView.printLottoResult(result);
    }
}
