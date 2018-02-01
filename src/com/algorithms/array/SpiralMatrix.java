package com.algorithms.array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<Integer>();
		int row = matrix.length;
		if(row <= 0)
			return result;
		int col = matrix[0].length;
		int size = row * col;

		int[][] tag = new int[row][col];

		int[] transRow = { 0, 1, 0, -1 };
		int[] transCol = { 1, 0, -1, 0 };
		int transIndex = 0;
		int index = 0, x = 0, y = 0;
		while (index < size) {
			result.add(matrix[x][y]);
			tag[x][y] = -1;

			int newX = x + transRow[transIndex];
			int newY = y + transCol[transIndex];
			if (newX >= row || newX < 0 || newY < 0 || newY >= col) {
				transIndex = (transIndex + 1) % 4;
			} else if (tag[newX][newY] == -1) {
				transIndex = (transIndex + 1) % 4;
			}
			x += transRow[transIndex];
			y += transCol[transIndex];
			index++;
		}

		return result;
	}
}
