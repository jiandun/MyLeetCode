package com.algorithms.array;

import java.util.HashMap;

public class SubarraySumEqualsK {
	// nums[i~j] = nums[0~j] - nums[0~i)
	public int subarraySum(int[] nums, int k) {
		int sum = 0, result = 0;
		HashMap<Integer, Integer> preSum = new HashMap<>();
		preSum.put(0, 1);
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (preSum.containsKey(sum - k)) {
				result += preSum.get(sum - k);
			}
			preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
		}
		return result;
	}

	// 勉强不会超时
	// 可以直接修改nums，就不需要new一个dp数组了
	public int _subarraySum(int[] nums, int k) {
		int[] dp = new int[nums.length];
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			int back = i;
			while (back >= 0) {
				dp[back] = dp[back] + nums[i];
				if (dp[back] == k)
					res++;
				back--;
			}
		}
		return res;
	}
}
