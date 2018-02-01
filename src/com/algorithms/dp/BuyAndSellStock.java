package com.algorithms.dp;

public class BuyAndSellStock {
	public int maxProfit(int[] prices) {
		int profit = 0;
		if(prices.length <= 0)
			return profit;
		int[] minPrice = new int[prices.length];
		minPrice[0] = prices[0];
		for(int i = 1 ; i < prices.length ; i++) {
			profit = Math.max(profit, prices[i]-minPrice[i-1]);
			minPrice[i] = Math.min(minPrice[i-1], prices[i]);
		}
		return profit;
	}

}
