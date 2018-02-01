package com.algorithms.array;

public class MaxAreaOfIsland {
	public int maxAreaOfIsland(int[][] grid) {
		int row = grid.length;
		int column = grid[0].length;
		int maxArea = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				int currentArea = surroundArea(grid, i, j, row, column);
				maxArea = Math.max(currentArea, maxArea);
			}
		}
		
		return maxArea;
	}

	public int surroundArea(int[][] grid, int i, int j, int row, int column) {
		if (i >= 0 && i < row && j >= 0 && j < column) {
			if (grid[i][j] == 1) {
				grid[i][j] = -1;//在递归之前就置为-1，否则导致递归嵌套StackOverFlow
				int result = 1 + surroundArea(grid, i, j - 1, row, column) + surroundArea(grid, i - 1, j, row, column)
						+ surroundArea(grid, i, j + 1, row, column) + surroundArea(grid, i + 1, j, row, column);
				return result;
			}
		}

		return 0;
	}

}
