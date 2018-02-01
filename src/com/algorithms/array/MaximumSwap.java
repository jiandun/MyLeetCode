package com.algorithms.array;

public class MaximumSwap {
	public int maximumSwap(int num) {
		if (num <= 11)
			return num;

		char[] digits = Integer.toString(num).toCharArray();
		int maxIndex = digits.length - 1;
		int[] swapPair = new int[2];
		for (int i = digits.length - 2; i >= 0; i--) {
			if (digits[i] < digits[maxIndex]) {
				swapPair[0] = maxIndex;
				swapPair[1] = i;
			} else if (digits[i] > digits[maxIndex]) {
				maxIndex = i;
			}
		}
		char temp = digits[swapPair[0]];
		digits[swapPair[0]] = digits[swapPair[1]];
		digits[swapPair[1]] = temp;
		return Integer.valueOf(new String(digits));
	}

	public int _maximumSwap(int num) {
		if (num <= 11)
			return num;

		int bits = 0;
		while (Math.pow(10, bits) <= num) {
			bits++;
		}
		bits--;
		int[] list = new int[bits + 1];
		int index = 0;
		while (index < list.length) {
			int power = (int) Math.pow(10, bits--);
			int b = num / power;
			num = num % power;
			list[index++] = b;
		}
		int maxIndex = list.length - 1;
		int[] swapPair = new int[2];
		for (int i = list.length - 2; i >= 0; i++) {
			if (list[i] < list[maxIndex]) {
				swapPair[0] = maxIndex;
				swapPair[1] = i;
			} else if (list[i] > list[maxIndex]) {
				maxIndex = i;
			}
		}

		return num;
	}

}
