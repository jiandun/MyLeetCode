package com.algorithms.dp;

public class MaximumLengthOfRepeatedSubarray {
	public int findLength(int[] A, int[] B) {
		int[][] result = new int[A.length + 1][B.length + 1];
		int max = 0;
		for (int i = A.length - 1; i >= 0; i--) {
			for (int j = B.length - 1; j >= 0; j--) {
				if (A[i] == B[j]) {
					result[i][j] = result[i + 1][j + 1] + 1;
					if (max < result[i][j])
						max = result[i][j];
				}
			}
		}
		return max;
	}

}
