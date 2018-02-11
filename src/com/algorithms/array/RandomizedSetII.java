package com.algorithms.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class RandomizedSetII {
	
	ArrayList<Integer> nums;
	HashMap<Integer, HashSet<Integer>> locs;
	java.util.Random rand = new java.util.Random();

	/** Initialize your data structure here. */
	public RandomizedSetII() {
		nums = new ArrayList<Integer>();
		locs = new HashMap<Integer, HashSet<Integer>>();
	}

	/**
	 * Inserts a value to the set. Returns true if the set did not already contain
	 * the specified element.
	 */
	public boolean insert(int val) {
		boolean contain = locs.containsKey(val);
		if (!contain)
			locs.put(val, new HashSet<Integer>());
		locs.get(val).add(nums.size());
		nums.add(val);
		return !contain;
	}

	/**
	 * Removes a value from the set. Returns true if the set contained the specified
	 * element.
	 */
	//据说，List.remove操作只有在使用下标且remove最后一个元素的时候才是O(1)，
	//涉及到底层实现，连题目都因为remove操作的消耗这一点改过，增加了“average”描述
	public boolean remove(int val) {
		boolean contain = locs.containsKey(val);
		if (!contain)
			return false;
		int loc = locs.get(val).iterator().next();
		locs.get(val).remove(loc);
		if (loc < nums.size() - 1) {
			int lastone = nums.get(nums.size() - 1);
			nums.set(loc, lastone);
			locs.get(lastone).remove(nums.size() - 1);
			locs.get(lastone).add(loc);
		}
		//交换了值之后直接删掉最后一个值即可
		nums.remove(nums.size() - 1);
		if (locs.get(val).isEmpty())
			locs.remove(val);
		return true;
	}

	/** Get a random element from the set. */
	public int getRandom() {
		return nums.get(rand.nextInt(nums.size()));
	}
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection(); boolean param_1 =
 * obj.insert(val); boolean param_2 = obj.remove(val); int param_3 =
 * obj.getRandom();
 */