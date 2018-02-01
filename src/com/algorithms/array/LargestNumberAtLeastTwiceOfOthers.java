package com.algorithms.array;

public class LargestNumberAtLeastTwiceOfOthers {
	public int dominantIndex(int[] nums) {
		int first = 0, second = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[first]) {
				second = first;
				first = i;
			} else if (nums[i] > nums[second]) {
				second = i;
			}
		}
		if (nums.length == 1 || nums[first] >= 2 * nums[second])
			return first;
		else
			return -1;
	}
}
