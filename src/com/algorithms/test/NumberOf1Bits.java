package com.algorithms.test;

public class NumberOf1Bits {
	public int hammingWeight(int n) {
		int result = 0;
		if (n < 0) {
			result = n % 2 == 0 ? 0 : 1;
			n = n >>> 1;
		}
		while (n > 0) {
			int r = n % 2;
			if (r == 1)
				result++;
			n /= 2;
		}
		return result;
	}

}
