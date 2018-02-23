package com.algorithms.math;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElements {
	//本质上没必要sort，只要求SUM(nums[i] - min)
	public int minMoves(int[] nums) {
		Arrays.sort(nums);
		int step = 0;
		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i] != nums[0]) {
				step += nums[i] - nums[0];
			}
		}
		return step;
	}
}
