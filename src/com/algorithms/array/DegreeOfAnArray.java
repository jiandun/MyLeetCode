package com.algorithms.array;

import java.util.HashMap;

public class DegreeOfAnArray {
	public int findShortestSubArray(int[] nums) {
		HashMap<Integer, Integer> left = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> right = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();

		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (!left.containsKey(nums[i])) {
				left.put(nums[i], i);
			}
			right.put(nums[i], i);
			int c = count.getOrDefault(nums[i], 0) + 1;
			count.put(nums[i], c);
			max = Math.max(c, max);
		}
		
		int degree = nums.length;
		for (int i = 0; i < nums.length; i++) {
			int d = right.get(nums[i]) - left.get(nums[i]) + 1;
			if(count.get(nums[i]) == max) {
				degree = Math.min(d, degree);
			}
		}
		
		return degree;
	}
}
