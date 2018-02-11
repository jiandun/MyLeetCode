package com.algorithms.array;

/**
 * 感觉其实应该算一个dp问题，但是放在array里面
 * 
 * @author maple
 *
 */
public class StockWithTransactionFee {
	public int maxProfit(int[] prices, int fee) {
		int n = prices.length;
		if (n <= 1)
			return 0;
		int[] buy = new int[n];
		int[] sell = new int[n];
		int[] hold = new int[n];
		int[] skip = new int[n];

		buy[0] = 0 - prices[0];
		hold[0] = 0 - prices[0];
		for (int i = 1; i < prices.length; i++) {
			buy[i] = Math.max(skip[i - 1], sell[i - 1]) - prices[i];
			sell[i] = Math.max(buy[i - 1], hold[i - 1]) + prices[i] - fee;
			hold[i] = Math.max(buy[i - 1], hold[i - 1]);
			skip[i] = Math.max(sell[i - 1], skip[i - 1]);
		}
		
		//个人觉得hold没必要放在这里讨论
		//skip其实也没有必要？
		return Math.max(Math.max(buy[n - 1], sell[n - 1]), Math.max(skip[n - 1], 0));
	}
}
