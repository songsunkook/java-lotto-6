package util;

import domain.Lotto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WinningLottoGeneratorTest {

    @Test
    public void 생성된_수가_6개인가() {
        //given
        WinningLottoGenerator winningLottoGenerator = new WinningLottoGenerator();
        Lotto lotto = winningLottoGenerator.create();
        List<Integer> lottoNumbers = lotto.getNumbers();

        //then
        assertEquals(6, lottoNumbers.size());
    }

    @Test
    public void 중복되지_않은_수를_반환하는가() {
        //given
        WinningLottoGenerator winningLottoGenerator = new WinningLottoGenerator();
        Lotto lotto = winningLottoGenerator.create();
        List<Integer> lottoNumbers = lotto.getNumbers();

        //when
        int size = (int)lottoNumbers.stream()
                .distinct()
                .count();

        //then
        assertEquals(6, size);
    }
}