package com.algorithms.array;

import java.util.Arrays;

public class FindKthSmallestPairDistance {
	public int _smallestDistancePair(int[] nums, int k) {
		Arrays.sort(nums);
		int lo = 0, hi = nums[nums.length - 1] - nums[0];
		while (lo < hi) {
			int mi = (lo + hi) / 2;
			int count = 0, left = 0;
			for (int right = 0; right < nums.length; ++right) {
				while (nums[right] - nums[left] > mi)
					left++;
				count += right - left;
			}
			// count = number of pairs with distance <= mi
			if (count >= k)
				hi = mi;
			else
				lo = mi + 1;
		}
		return lo;
	}

	public int smallestDistancePair(int[] nums, int k) {
		int n = nums.length;
		Arrays.sort(nums);
		int low = nums[1] - nums[0];
		for (int i = 1; i < n - 1; i++)
			low = Math.min(low, nums[i + 1] - nums[i]);
		int high = nums[n - 1] - nums[0];

		while (low < high) {
			int mid = low + (high - low) / 2;
			if (countPairs(nums, mid) < k)
				low = mid + 1;
			else
				high = mid;
		}

		return low;
	}

	public int countPairs(int[] nums, int mid) {
		int n = nums.length, res = 0;
		for (int i = 0; i < n; i++) {
			int j = i;
			while (j < n && nums[j] - nums[i] <= mid)
				j++;
			res += j - i + 1;
		}
		return res;
	}
}
