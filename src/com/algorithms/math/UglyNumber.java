package com.algorithms.math;

public class UglyNumber {
	public boolean isUgly(int num) {
		int[] factors = new int[] { 2, 3, 5 };
		for (int i = 0; i < factors.length; i++) {
			while (num % factors[i] == 0 && num > 0) {
				num = num / factors[i];
			}
		}
		return num == 1;
	}
}
