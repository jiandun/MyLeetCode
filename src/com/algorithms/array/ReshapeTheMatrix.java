package com.algorithms.array;

public class ReshapeTheMatrix {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		int row = nums.length;
		int column = nums[0].length;
		int size = row * column;

		if (size != r * c) {
			return nums;
		}
		
		int[][] result = new int[r][c];
		for (int i = 0; i < size; i++) {
			result[i / c][i % c] = nums[i / column][i % column];
		}
		return result;
	}

}
