package com.algorithms.math;

/**
 * 
(1 + X) * X = 2n
4X * X + 4 * X = 8n
(2X + 1)(2X + 1) - 1 = 8n
X = (Math.sqrt(8 * n + 1) - 1)/ 2


 * @author maple
 *
 */
public class ArrangingCoins {
    public int arrangeCoins(int n) {
        return (int)((-1 + Math.sqrt(1 + 8 * (long)n)) / 2);
    }

	public int _arrangeCoins(int n) {
		int level = (int) Math.sqrt(2.0 * n);
		int count = (level % 2 == 0) ? level / 2 * (level + 1) : (level + 1) / 2 * level;
		while (count > n) {
			level--;
			count = level * (level + 1) / 2;
		}
		return level;
	}
}
