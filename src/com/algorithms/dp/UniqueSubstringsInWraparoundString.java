package com.algorithms.dp;

import java.util.HashSet;

public class UniqueSubstringsInWraparoundString {

	// 超时！！！
	public int findSubstringInWraproundString(String p) {
		int size = p.length();
		HashSet<String> result = new HashSet<>();
		boolean[][] dp = new boolean[size][size];
		for (int i = size - 1; i >= 0; i--) {
			for (int j = i; j < size; j++) {
				if (i == j) {
					dp[i][j] = true;
				} else if (j - i == 1) {
					int gap = p.charAt(j) - p.charAt(i);
					dp[i][j] = gap == 1 || gap == -25;
				} else {
					int gap = p.charAt(i + 1) - p.charAt(i);
					dp[i][j] = (gap == 1 || gap == -25) && dp[i + 1][j];
				}
				if (dp[i][j])
					result.add(p.substring(i, j + 1));
			}
		}
		return result.size();
	}

	public int _findSubstringInWraproundString(String p) {
		int[] count = new int[26];
		int maxLength = 0;
		for (int i = 0; i < p.length(); i++) {
			if (i > 0 && (p.charAt(i) - p.charAt(i - 1) == 1 || p.charAt(i) - p.charAt(i - 1) == -25)) {
				maxLength++;
			} else {
				maxLength = 1;
			}
			int countIndex = p.charAt(i) - 'a';
			count[countIndex] = Math.max(count[countIndex], maxLength);
		}
		for (int i = 1; i < count.length; i++) {
			count[0] += count[i];
		}
		return count[0];
	}

}
