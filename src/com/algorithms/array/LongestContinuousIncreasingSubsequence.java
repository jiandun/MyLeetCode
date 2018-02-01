package com.algorithms.array;

import java.util.Stack;

public class LongestContinuousIncreasingSubsequence {
	public int findLengthOfLCIS(int[] nums) {
		Stack<Integer> stack = new Stack<>();
		int size = 0;
		for (int i = 0; i < nums.length; i++) {
			if(!stack.isEmpty() && nums[i] <= stack.peek()) {
				size = Math.max(size, stack.size());
				stack.clear();
			}
			stack.push(nums[i]);
		}
		
		return Math.max(size, stack.size());
	}
}
