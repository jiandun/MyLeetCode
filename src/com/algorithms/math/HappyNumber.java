package com.algorithms.math;

import java.util.HashSet;

public class HappyNumber {
	public boolean isHappy(int n) {
		HashSet<Integer> process = new HashSet<>();
		int sum = n;
		while (sum != 1) {
			int temp = 0;
			char[] bits = Integer.toString(sum).toCharArray();
			for (int i = 0; i < bits.length; i++) {
				temp += (bits[i] - '0') * (bits[i] - '0');
			}
			if (process.contains(temp)) {
				return false;
			} else {
				process.add(temp);
				sum = temp;
			}
		}
		return true;
	}
}
