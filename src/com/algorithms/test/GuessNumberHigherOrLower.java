package com.algorithms.test;

public class GuessNumberHigherOrLower {
	private final int T = 1702766719;

	public int guessNumber(int n) {
		int min = 1, max = n;
		int target = min + (max - min) / 2;
		int guess = guess((min + max) / 2);
		while (guess != 0) {
			if (guess == -1) {
				max = target - 1;
			}
			if (guess == 1) {
				min = target + 1;
			}
			target = min + (max - min) / 2;
			System.out.println(target);
			guess = guess(target);
		}
		return target;
	}

	private int guess(int number) {
		if (T == number)
			return 0;
		else
			return T > number ? 1 : -1;
	}
}
