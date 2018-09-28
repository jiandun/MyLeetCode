package com.algorithms.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();

		backtrack(result, new ArrayList<Integer>(), nums);
		return result;
	}

	private void backtrack(List<List<Integer>> result, ArrayList<Integer> row, int[] nums) {
		if (row.size() == nums.length) {
			result.add(new ArrayList<Integer>(row));
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (row.contains(nums[i]))
					continue;
				row.add(nums[i]);
				backtrack(result, row, nums);
				row.remove(row.size() - 1);
			}
		}
	}

}
