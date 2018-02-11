package com.algorithms.array;

public class ArrayNesting {
	public int arrayNesting(int[] nums) {
		int res = -1;
		boolean[] used = new boolean[nums.length];//可以直接修改nums，比如将值改为-1
		for (int i = 0; i < nums.length; i++) {
			if (used[i]) {
				continue;
			}
			int length = 0, k = i;
			while (!used[k]) {
				length++;
				used[k] = true;
				k = nums[k];
			}
			if (length > res) {
				res = length;
				if (res > nums.length / 2)
					break;
			}
		}
		return res;
	}
}
