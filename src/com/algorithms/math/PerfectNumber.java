package com.algorithms.math;

/**
 * 28, 496, 8128, 33550336
 * @author maple
 *
 */
public class PerfectNumber {
	public boolean checkPerfectNumber(int num) {
		int sum = 0;
		int div = num / 2;
		while (div > 0) {
			if (num % div == 0) {
				sum += div;
			}
			div--;
		}
		return sum == num;
	}

	public boolean _checkPerfectNumber(int num) {
		int sum = 1;
		int min = 2, border = (int)Math.sqrt(num);
		while (min <= border) {
			if (num % min == 0) {
				int max = num / min;
				sum += min + ((min != max) ? max : 0);
			}
			if(sum > num)
				break;
			min++;
		}
		return sum == num;
	}
}
