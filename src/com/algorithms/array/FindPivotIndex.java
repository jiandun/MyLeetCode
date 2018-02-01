package com.algorithms.array;

import java.util.HashMap;

public class FindPivotIndex {
	public int pivotIndex(int[] nums) {
		HashMap<Integer, Integer> left = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			left.put(i, nums[i] + left.getOrDefault(i - 1, 0));
		}
		int total = left.getOrDefault(nums.length - 1, 0);
		for (int i = 0; i < nums.length; i++) {
			if (left.getOrDefault(i - 1, 0) == (total - left.get(i))) {
				return i;
			}
		}
		return -1;
	}
}
