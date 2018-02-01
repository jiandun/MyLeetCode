package com.algorithms.dp;

public class OnesAndZeroes {
	//倒序计算
	public int findMaxForm(String[] strs, int m, int n) {
		int[][] dp = new int[m + 1][n + 1];
		for (String s : strs) {
			int zero = 0, one = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '0') {
					zero++;
				} else {
					one++;
				}
			}

			for (int i = m; i > zero - 1; i--) {
				for (int j = n; j > one - 1; j--) {
					dp[i][j] = Math.max(dp[i][j], dp[i - zero][j - one] + 1);
				}
			}
		}

		return dp[m][n];
	}

}
