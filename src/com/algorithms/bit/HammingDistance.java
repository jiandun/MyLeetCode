package com.algorithms.bit;

public class HammingDistance {
	public int hammingDistance(int x, int y) {
		int count = 0, result = x ^ y;
		while (result > 0) {
			count += result % 2;
			result = result >> 1;
		}
		return count;
	}
}
