package com.algorithms.math;

public class PlusOne {
	public int[] plusOne(int[] digits) {
        if(digits == null || digits.length <= 0){
            return null;
        }
		int plus = 0;
		digits[digits.length - 1] += 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			digits[i] = digits[i] + plus;
			if (digits[i] >= 10) {
				plus = 1;
				digits[i] = digits[i] - 10;
			} else {
				plus = 0;
			}
		}
		int[] result = new int[digits.length + plus];
		if (plus > 0)
			result[0] = plus;
		for (int i = 0; i < digits.length; i++) {
			result[i + plus] = digits[i];
		}
		return result;
	}
}
