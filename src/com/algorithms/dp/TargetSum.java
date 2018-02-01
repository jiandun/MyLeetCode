package com.algorithms.dp;

public class TargetSum {
	public int findTargetSumWays(int[] nums, int S) {
		return count(nums.length - 1, nums, S);
	}

	private int count(int index, int[] nums, int S) {
		if (index == 0) {
			return (nums[index] == S ? 1 : 0) + (-nums[index] == S ? 1 : 0);
		} else {
			return count(index - 1, nums, S - nums[index]) + count(index - 1, nums, S + nums[index]);
		}
	}

	public int _findTargetSumWays(int[] nums, int S) {
		int sum = S;
		for (int n : nums) {
			sum += n;
		}
		if (sum % 2 != 0)
			return 0;

		int[] dp = new int[sum / 2 + 1];
		dp[0] = 1;
		for (int n : nums) {
			for (int i = sum / 2; i >= n; i--) {
				dp[i] += dp[i - n];
			}
			
//			System.out.print(n+" dp : ");
//			for(int index : dp) {
//				System.out.print(index+", ");
//			}
//			System.out.println();
		}
		return dp[sum / 2];
	}
}
