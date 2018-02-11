package com.algorithms.array;

public class SearchInRotatedSortedArray {
	public int search(int[] nums, int target) {
		int left = 0, right = nums.length - 1;
		while (left <= right) {
			int middle = (left + right) / 2;
			if (nums[middle] == target)
				return middle;
			
			// >=要注意，不能是>
			if (nums[middle] >= nums[left]) {
				if (target >= nums[left] && target < nums[middle]) {
					right = middle - 1;
				} else {
					left = middle + 1;
				}
			}

			if (nums[middle] <= nums[right]) {
				if (target > nums[middle] && target <= nums[right]) {
					left = middle + 1;
				} else {
					right = middle - 1;
				}
			}
		}
		return -1;
	}
}
