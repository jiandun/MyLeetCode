package com.algorithms.array;

public class ToeplitzMatrix {
	public boolean isToeplitzMatrix(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;

		for (int i = 0; i < row; i++) {
			int rowIndex = i, colIndex = 0;
			int start = matrix[rowIndex++][colIndex++];
			while (colIndex < col && rowIndex < row) {
				if (matrix[rowIndex++][colIndex++] != start)
					return false;
			}
		}
		for (int j = 1; j < col; j++) {
			int rowIndex = 0, colIndex = j;
			int start = matrix[rowIndex++][colIndex++];
			while (colIndex < col && rowIndex < row) {
				if (matrix[rowIndex++][colIndex++] != start)
					return false;
			}
		}
		return true;
	}
}
