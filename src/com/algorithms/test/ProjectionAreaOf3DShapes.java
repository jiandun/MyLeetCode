package com.algorithms.test;

public class ProjectionAreaOf3DShapes {
	public int projectionArea(int[][] grid) {
		int row = grid.length;
		int column = grid[0].length;

		int xy = 0, xz = 0, yz = 0;
		for (int i = 0; i < row; i++) {
			int maxRow = 0;
			for (int j = 0; j < column; j++) {
				xy += grid[i][j] != 0 ? 1 : 0;
				maxRow = (grid[i][j] > maxRow) ? grid[i][j] : maxRow;
			}
			yz += maxRow;
		}
		for (int j = 0; j < column; j++) {
			int maxColumn = 0;
			for (int i = 0; i < row; i++) {
				maxColumn = (grid[i][j] > maxColumn) ? grid[i][j] : maxColumn;
			}
			xz += maxColumn;
		}
		return xy + xz + yz;
	}
}
