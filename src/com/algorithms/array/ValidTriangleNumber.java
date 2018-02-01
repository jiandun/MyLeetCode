package com.algorithms.array;

import java.util.Arrays;

public class ValidTriangleNumber {
	public int triangleNumber(int[] nums) {
		Arrays.sort(nums);
		int count = 0;
		for (int i = nums.length - 1; i >= 2; i--) {
			int l = 0, r = i - 1;
			while (l < r) {
				if (nums[l] + nums[r] > nums[i]) {
					count += r - l;
					r--;
				} else
					l++;
			}
		}
		return count;
	}

	public int _triangleNumber(int[] nums) {
		Arrays.sort(nums);
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int shortTwo = nums[i] + nums[j];
				int k = j + 1;
				while (k < nums.length && nums[k] < shortTwo) {
					result++;
					k++;
				}
			}
		}
		return result;
	}
}
