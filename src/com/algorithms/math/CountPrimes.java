package com.algorithms.math;

/**
 * Sieve of Eratosthenes
 * 
 * @author maple
 *
 */
public class CountPrimes {
	public int countPrimes(int n) {
		boolean[] number = new boolean[n];
		int result = 0;
		int max = (int) Math.sqrt(n);
		for (int i = 2; i <= max; i++) {
			if (number[i]) {
				continue;
			}
			result++;
			for (int j = i*2; j < number.length; j += i) {
				number[j] = true;
			}
		}
		for (int i = max+1; i < number.length; i++) {
			if (!number[i]) {
				result++;
			}
		}
		return result;
	}
}
