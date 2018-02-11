package com.algorithms.math;

/**
 * 0也是可以作为其中的一个数的。。。
 * 
 * @author maple
 *
 */
public class SumOfSquareNumbers {
	public boolean judgeSquareSum(int c) {
		int left = 0;
		int right = (int) Math.sqrt(c);
		while (left <= right) {
			int sum = left * left + right * right;
			if (sum < c) {
				left++;
			} else if (sum > c) {
				right--;
			} else {
				return true;
			}
		}
		return false;
	}

	public boolean _judgeSquareSum(int c) {
		int max = (int) Math.sqrt(c);
		for (int i = max; i >= 0; i--) {
			int last = c - i * i;
			int another = (int) Math.sqrt(last);
			if (another * another == last) {
				System.out.println(i + "~~~" + another);
				return true;
			}
		}
		return false;
	}
}
