package lotto.contoller;

import java.util.List;
import lotto.controller.LottoController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class LottoControllerTest {
    @DisplayName("로또 번호 당첨 개수를 제대로 계산한다.")
    @Test
    void calculatePrice() {
        // Given
        LottoController controller = new LottoController();

        // 로또 번호 생성
        List<List<Integer>> realLotto = List.of(
                List.of(1, 2, 3, 4, 5, 6),
                List.of(1, 2, 3, 4, 7, 8),
                List.of(1, 2, 3, 4, 9, 10)
        );
        controller.realLotto = realLotto;

        // 당첨 번호 설정
        controller.winningNumber = List.of(1, 2, 3, 4, 5, 6);

        // 보너스 번호 설정
        controller.bonusNumber = 7;

        // When
        int[] result = controller.calculatePrice();

        // Then
        assertThat(result[6]).isEqualTo(1); // 6개 맞춘 로또는 1개
        assertThat(result[5]).isEqualTo(0); // 5개 맞춘 로또는 0개
        assertThat(result[7]).isEqualTo(0); // 보너스 맞춘 로또는 0개
    }
}
