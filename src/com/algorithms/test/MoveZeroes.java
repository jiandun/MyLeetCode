package com.algorithms.test;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		int startZero = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				if (startZero < 0)
					startZero = i;
			}
		}

		if (startZero >= 0) {
			for (int i = startZero + 1; i < nums.length; i++) {
				if (nums[i] != 0) {
					nums[startZero] = nums[i];
					startZero++;
				}
			}
			for (int i = startZero; i < nums.length; i++)
				nums[i] = 0;
		}
	}
}
