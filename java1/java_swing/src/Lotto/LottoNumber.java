package Lotto;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class LottoNumber {

	final int LOTTO_NUMBER_SIZE = 6;

	public int[] lottonNumSelected() {
		Random random = new Random();
		int[] lottoWinNum = new int[LOTTO_NUMBER_SIZE];

		for (int i = 0; i < 6; i++) {
			lottoWinNum[i] = random.nextInt(45) + 1;
			for (int e = 0; e < i; e++) {
				if (lottoWinNum[i] == lottoWinNum[e]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lottoWinNum);
		return lottoWinNum;
	}

}
