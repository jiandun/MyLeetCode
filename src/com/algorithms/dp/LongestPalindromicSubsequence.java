package com.algorithms.dp;

public class LongestPalindromicSubsequence {
	public int longestPalindromeSubseq(String s) {
		int size = s.length();
		if(size == 0)
			return 0;
		int[][] dp = new int[size][size];

		for (int i = size - 1; i >= 0; i--) {
			for (int j = i; j < size; j++) {
				if (i == j) {
					dp[i][j] = 1;
				} else {
					if (s.charAt(i) == s.charAt(j)) {
						dp[i][j] = dp[i + 1][j - 1] + 2;
					} else {
						dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
					}
				}
			}
		}
		return dp[0][size-1];
	}
}
