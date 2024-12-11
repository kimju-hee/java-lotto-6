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

    public void printBonusNumberText() {
        System.out.println();
        System.out.println("보너스 번호를 입력해 주세요.");
    }

    public void printLottoResult(int[] result) {
        System.out.println();
        System.out.println("당첨 통계");
        System.out.println("---");
        int three = result[3], four = result[4], five = result[5], bonus = result[7], six = result[6];
        System.out.println("3개 일치 (5,000원) - " + three + "개");
        System.out.println("4개 일치 (50,000원) - " + four + "개");
        System.out.println("5개 일치 (1,500,000원) - " + five + "개");
        System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - " + bonus + "개");
        System.out.println("6개 일치 (2,000,000,000원) - " + six + "개");
    }
}
