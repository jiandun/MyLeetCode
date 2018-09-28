package com.algorithms.test;

import java.util.Stack;

public class ReverseBits {
	public int reverseBits(int n) {
		Stack<Integer> stack = new Stack<Integer>();
		if (n < 0) {
			stack.push(n % 2);
			n = n >>> 1;
		}
		while (n > 0) {
			stack.push(n % 2);
			n = n / 2;
		}
		int size = stack.size(), result = 0, bit = 0;
		while (!stack.isEmpty()) {
			result += stack.pop() << bit;
			bit++;
		}
		result = result << (32 - size);
		return result;
	}

}
