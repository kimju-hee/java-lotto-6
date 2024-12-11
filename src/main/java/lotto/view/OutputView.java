package lotto.view;

import java.util.List;

public class OutputView {
    public void printPurchasePriceText() {
        System.out.println("구입금액을 입력해 주세요.");
    }

    public void printIssuedText(int count) {
        System.out.println(count + "개를 구매했습니다.");
    }

    public void printIssuedLotto(List<Integer> lotto) {
        System.out.println(lotto.toString());
    }

    public void printWinningTextNumber() {
        System.out.println();
        System.out.println("당첨 번호를 입력해 주세요.");
    }
}
