package com.algorithms.math;

public class Sqrt {
	public int mySqrt(int x) {
		if (x <= 1)
			return x;
		int left = 1, right = x / 2, middle = (left + right) / 2;
		while (left <= right) {
			int another = x / middle;
			if (another == middle)
				return middle;

			left = Math.min(middle, another) + 1;
			right = Math.max(middle, another) - 1;
			middle = (left + right) / 2;
		}
		return Math.min(left, right);
	}
}
