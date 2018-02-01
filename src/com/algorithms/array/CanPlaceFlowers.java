package com.algorithms.array;

public class CanPlaceFlowers {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		int maxFlowers = 0;
		int start = -2;
		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i] == 1) {
				if (i - start - 1 >= 3) {
					maxFlowers += (i - start - 1 - 3) / 2 + 1;
				}
				start = i;
			} else if (i == flowerbed.length - 1) {
				if (flowerbed.length - start >= 3) {
					maxFlowers += (flowerbed.length - start - 3) / 2 + 1;
				}
			}
		}
		return maxFlowers >= n;
	}

}
