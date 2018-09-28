package com.algorithms.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
		ArrayList<List<Integer>> result = new ArrayList<>();
		result.add(new ArrayList<Integer>());
		bt(result, nums, 0, new ArrayList<Integer>());
		return result;
	}

	private void bt(ArrayList<List<Integer>> result, int[] nums, int start, ArrayList<Integer> pre) {
		if(start > nums.length -1) {
			return;
		}else {
			bt(result, nums, start+1, pre);
			
			pre.add(nums[start]);
			result.add(new ArrayList<Integer>(pre));
			bt(result, nums, start+1, pre);
			pre.remove(pre.size()-1);
		}
	}

}
