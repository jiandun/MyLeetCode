package com.algorithms.dp;

public class MinimumPathSum {
	public int minPathSum(int[][] grid) {
		int row = grid.length;
		int col = grid[0].length;
		int[][] dp = new int[row + 1][col + 1];
		for (int border = 0; border < row - 1; border++)
			dp[border][col] = Integer.MAX_VALUE;
		for (int border = 0; border < col - 1; border++)
			dp[row][border] = Integer.MAX_VALUE;

		for (int i = row - 1; i >= 0; i++) {
			for (int j = col - 1; j >= 0; j++) {
				dp[i][j] = Math.min(grid[i][j] + dp[i + 1][j], grid[i][j] + dp[i][j + 1]);
			}
		}
		return dp[0][0];
	}

}
