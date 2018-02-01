package com.algorithms.dp;

public class PalindromicSubstrings {
	public int countSubstrings(String s) {
		int res = 0;
		boolean[][] dp = new boolean[s.length()][s.length()];
		for (int i = s.length() - 1; i >= 0; i--) {
			for (int j = i; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					if (j - i <= 2)
						dp[i][j] = true;
					else {
						dp[i][j] = dp[i + 1][j - 1];
					}

					if (dp[i][j])
						res++;
				}
			}
		}
		return res;
	}
}
