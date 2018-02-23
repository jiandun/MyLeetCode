package com.algorithms.array;

public class FindMinimumInRotatedSortedArray {
	public int findMin(int[] nums) {
		if (nums == null || nums.length <= 0) {
			return 0;
		}
		if (nums.length == 1) {
			return nums[0];
		}
		int left = 0, right = nums.length - 1;
		while (left < right) {
			int middle = (left + right) / 2;
			if (middle > 0 && nums[middle] < nums[middle - 1]) {
				return nums[middle];
			}
			//3 3 1 3 3 3 3 3 3 3 3
			if (nums[left] <= nums[middle] && nums[middle] > nums[right]) {
				left = middle + 1;
			} else {
				right = middle - 1;
			}
		}
		return nums[left];
	}
}
