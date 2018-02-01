package com.algorithms.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	/*
	 * 利用Map来找到另一个加数；
	 * 前提是数组内的数唯一，且每个数只能用一次
	 */
	public int[] twoSum(int[] numbers, int target) {
	    int[] result = new int[2];
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < numbers.length; i++) {
	        if (map.containsKey(target - numbers[i])) {
	            result[1] = i;
	            result[0] = map.get(target - numbers[i]);
	            return result;
	        }
	        map.put(numbers[i], i);
	    }
	    return result;
	}
}
