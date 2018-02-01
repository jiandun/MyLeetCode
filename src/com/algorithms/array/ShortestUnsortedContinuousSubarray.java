package com.algorithms.array;

import java.util.Arrays;
import java.util.Stack;

public class ShortestUnsortedContinuousSubarray {
	public int findUnsortedSubarray(int[] nums) {
		int[] temp = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			temp[i] = nums[i];
		}
		Arrays.sort(temp);
		int start = 0;
		int end = -1;

		for (int i = 0; i < nums.length; i++) {
			if (temp[i] != nums[i]) {
				start = i;
				break;
			}
		}
		for (int i = nums.length - 1; i >= 0; i--) {
			if (temp[i] != nums[i]) {
				end = i;
				break;
			}
		}
		return end - start + 1;
	}

	public int _findUnsortedSubarray(int[] nums) {
		Stack<Integer> stack = new Stack<>();
		int left = nums.length, right = 0;

		for (int i = 0; i < nums.length; i++) {
			while (!stack.isEmpty() && nums[i] < nums[stack.peek()])
				left = Math.min(left, stack.pop());
			stack.push(i);
		}
		stack.clear();
		for (int j = nums.length - 1; j >= 0; j--) {
			while (!stack.isEmpty() && nums[j] > nums[stack.peek()])
				right = Math.max(right, stack.pop());
			stack.push(j);
		}

		return left < right ? (right - left + 1) : 0;
	}
}
