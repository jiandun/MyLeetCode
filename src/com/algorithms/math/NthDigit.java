package com.algorithms.math;

/**
 * 1~9: 9*1 
 * 10~99: 90*2 
 * 100~999: 900*3 ...
 * 
 * @author maple
 *
 */
public class NthDigit {
	public int findNthDigit(int n) {
		int start = 1, len = 1;
		long base = 9;
		while (n > len * base) {
			n = n - len * (int) base;
			len++;
			start *= 10;
			base *= 10;
		}
		int target = start + (n - 1) / len;
		int reminder = (n - 1) % len;
		return Character.getNumericValue(Integer.toString(target).charAt(reminder));
	}
}
