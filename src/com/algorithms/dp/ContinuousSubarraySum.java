package com.algorithms.dp;

import java.util.HashMap;

public class ContinuousSubarraySum {
	public boolean checkSubarraySum(int[] nums, int k) {
		if (nums.length <= 1)
			return false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0 && nums[i + 1] == 0)
				return true;
		}
		if (k == 0)
			return false;
		if (k < 0)
			k = -k;
		HashMap<Integer, Integer> sumToIndex = new HashMap<>();
		int sum = 0;
		sumToIndex.put(0, -1);
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			for (int j = (sum / k) * k; j >= k; j -= k) {
				if (sumToIndex.containsKey(sum - j) && (i - sumToIndex.get(sum - j) > 1)) {
					return true;
				}
			}
			if (!sumToIndex.containsKey(sum))
				sumToIndex.put(sum, i);
		}
		return false;
	}

}
