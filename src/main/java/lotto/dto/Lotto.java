package lotto.dto;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lotto.controller.LottoController;

public class Lotto {
    private final List<Integer> numbers;
    private final LottoController lottoController = new LottoController();

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
        if (hasDuplicate(numbers)) {
            throw new IllegalArgumentException();
        }
    }

    private boolean hasDuplicate(List<Integer> numbers) {
        Set<Integer> set = new HashSet<>(numbers);
        return set.size() != numbers.size();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
