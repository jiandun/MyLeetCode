package com.algorithms.array;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {
	//对nums[i]的值取反也是可以的，因为题设规定数组里面同样的数最多出现两次
	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			int real = nums[i] % (nums.length + 1);
			nums[real - 1] += nums.length + 1;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] / (nums.length + 1) == 2)
				result.add(i + 1);
		}
		return result;
	}
}
