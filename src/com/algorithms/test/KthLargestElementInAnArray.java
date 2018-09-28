package com.algorithms.test;

public class KthLargestElementInAnArray {
	public int findKthLargest(int[] nums, int k) {
		return findK(nums, k, 0, nums.length - 1);
	}

	private int findK(int[] nums, int k, int left, int right) {
		int target = left, l = left, r = right;
		while (l < r) {
			while (l < r && nums[r] < nums[target])
				r--;
			while (l < r && nums[l] >= nums[target])
				l++;
			if (l < r) {
				int temp = nums[r];
				nums[r] = nums[l];
				nums[l] = temp;
			}
		}
		int temp = nums[l];
		nums[l] = nums[target];
		nums[target] = temp;
		
		int kth = l - left + 1;
		if (kth == k) {
			return nums[l];
		} else if (kth > k) {
			return findK(nums, k, left, l - 1);
		} else {
			return findK(nums, k - kth, l+1, right);
		}
	}
}
