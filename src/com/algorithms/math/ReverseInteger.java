package com.algorithms.math;

public class ReverseInteger {
	public int reverse(int x) {
		int sign = (x > 0) ? 1 : -1;
		x = Math.abs(x);
		char[] digits = (x + "").toCharArray();
		long sum = 0;
		for (int i = 0; i < digits.length; i++) {
			sum += (digits[i] - '0') * Math.pow(10, i);
		}
		long result = sum * sign;
		if (result <= Integer.MAX_VALUE && result >= Integer.MIN_VALUE)
			return (int) result;
		else
			return 0;
	}
}
