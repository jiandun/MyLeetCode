package com.algorithms.math;

public class SetMismatch {
	public int[] findErrorNums(int[] nums) {
		boolean[] position = new boolean[nums.length];
		int[] result = new int[2];
		for (int i : nums) {
			if (position[i - 1]) {
				result[0] = i;
			} else {
				position[i - 1] = true;
			}
		}
		for (int i = 0; i < position.length; i++) {
			if (!position[i]) {
				result[1] = i + 1;
			}
		}
		return result;
	}
}
