package com.algorithms.array;

public class PlusOne {
	public int[] plusOne(int[] digits) {
		int plus = 1;

		for(int index = digits.length-1; index >= 0 ; index--) {
			digits[index] += plus;
			if(digits[index] >= 10) {
				digits[index] -= 10;
			}else {
				plus = 0;
				break;
			}
		}
		if(plus == 1) {
			int[] result = new int[digits.length+1];
			result[0] = plus;
			for(int i = 1 ; i < result.length ; i++) {
				result[i] = digits[i-1];
			}
			return result;
		}
		return digits;
	}

}
