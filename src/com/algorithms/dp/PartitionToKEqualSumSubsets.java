package com.algorithms.dp;

import java.util.Arrays;

public class PartitionToKEqualSumSubsets {
	public boolean canPartitionKSubsets(int[] nums, int k) {
		int sum = 0;
		for (int i : nums)
			sum += i;
		if(sum % k != 0)
			return false;
		
		Arrays.sort(nums);
		return search(new int[k], nums.length-1, nums, sum%k);
	}

	public boolean search(int[] groups, int row, int[] nums, int target) {
		if(row < 0)
			return true;
		int v = nums[row--];
		for(int i = 0 ; i < groups.length ; i++) {
			if(groups[i] + v <= target) {
				groups[i] += v;
				if(search(groups, row, nums, target))
					return true;
				groups[i] -= v;
			}
			//这个break可加可不加？加了会快一些
			if(groups[i] == 0)
				break;
		}
		return false;
	}
	
}
