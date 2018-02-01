package com.algorithms.dp;

public class ClimbingStairs {
	public int climbStairs(int n) {
		int[] steps = new int[n + 2];
		steps[1] = 1;
		steps[2] = 2;
		for (int i = 3; i <= n; i++) {
			steps[i] = steps[i - 1] + steps[i - 2];
		}

		return steps[n];
	}

	public int _climbStairs(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		return _climbStairs(n - 1) + _climbStairs(n - 2);
	}
}
