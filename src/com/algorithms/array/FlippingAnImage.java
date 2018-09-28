package com.algorithms.array;

public class FlippingAnImage {
	public int[][] flipAndInvertImage(int[][] A) {
		for (int i = 0; i < A.length; i++) {
			int[] row = A[i];
			for (int j = 0; j < row.length / 2; j++) {
				int temp = row[j] ^ 1;
				row[j] = row[row.length - j - 1] ^ 1;
				row[row.length - j - 1] = temp;
			}
			if (row.length % 2 == 1) {
				row[row.length / 2] ^= 1;
			}
		}
		return A;
	}
}