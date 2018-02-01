package com.algorithms.array;

public class TwoSumII {
	/**
	 * too easy to test
	 * @param numbers
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] numbers, int target) {
		int left = 0, right = numbers.length - 1;
		while (left < right) {
			int sum = numbers[left] + numbers[right];
			if (sum == target) {
				break;
			} else if (sum > target) {
				right--;
			} else {
				left++;
			}
		}

		return new int[] { left + 1, right + 1 };
	}
}
