package com.algorithms.array;

public class ThirdMaximumNumber {
	public int thirdMax(int[] nums) {
		Integer first = null, second = null, third = null;
		for (Integer index : nums) {
			if (index.equals(first) || index.equals(second) || index.equals(third))
				continue;
			if (first == null || index > first) {
				third = second;
				second = first;
				first = index;
			} else if (second == null || index > second) {
				third = second;
				second = index;
			} else if (third == null || index > third) {
				third = index;
			}
		}
		return third == null ? first : third;
	}
}
