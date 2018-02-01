package com.algorithms.array;

import java.util.HashSet;

public class KDiffPairsInAnArray {
	public int findPairs(int[] nums, int k) {
		if(k < 0)
			return 0;
		HashSet<Integer> min = new HashSet<>();
		HashSet<Integer> unique = new HashSet<>();
		for (int n : nums) {
			if (unique.contains(n - k))
				min.add(n - k);
			if (unique.contains(n + k))
				min.add(n);
			unique.add(n);
		}
		return min.size();
	}
}
