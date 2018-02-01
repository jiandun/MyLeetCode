package com.algorithms.string;

/**
 * 最长回文子串
 * 
 * @author maple
 *
 */
public class LongestPalindromicSubstring {
	public String longestPalindrome(String s) {
		int size = s.length();
		int[][] dp = new int[size][size];
		int maxStart = 0;
		int maxEnd = 0;

		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				dp[i][j] = isSubStringP(s, dp, i, j);

				if (dp[i][j] > 0 && (j - i + 1) > (maxEnd - maxStart + 1)) {
					maxStart = i;
					maxEnd = j;
				}
			}
		}

		return s.substring(maxStart, maxEnd + 1);
	}

	public int isSubStringP(String s, int[][] dp, int start, int end) {
		if (end - start <= 0) {
			return 1;
		}
		if (dp[start][end] > 0) {
			return 1;
		}
		if (dp[start][end] == 0) {
			if (s.charAt(start) == s.charAt(end)) {
				return isSubStringP(s, dp, start + 1, end - 1);
			} else {
				return -1;
			}
		}
		return -1;
	}
}
