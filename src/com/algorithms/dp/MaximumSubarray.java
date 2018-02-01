package com.algorithms.dp;

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			max = Math.max(sum, max);
			sum = sum < 0 ? 0 : sum;
		}
		
		return max;
	}

}
