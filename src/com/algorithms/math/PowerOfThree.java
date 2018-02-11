package com.algorithms.math;

public class PowerOfThree {
	public boolean isPowerOfThree(int n) {
		int bigestPowerOfThree = (int) Math.pow(3, 19);
		return (n > 0 && bigestPowerOfThree % n == 0);
	}
}
