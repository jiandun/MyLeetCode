package com.algorithms.dp;

public class HouseRobber {
	public int rob(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (i == 0)
				result[i] = nums[i];
			else if (i == 1)
				result[i] = Math.max(nums[i - 1], nums[i]);
			else
				result[i] = Math.max(result[i - 1], result[i - 2] + nums[i]);
		}

		return result.length > 0 ? result[result.length - 1] : 0;
	}

}
