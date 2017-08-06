package com.algorithms.array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

	/*
	 * 构建一个rowIndex+3的数组，第0位和第rowIndex+2位一直都是0；
	 * 每次构建一行的时候从行的末尾开始计算，利用f(n,k) = f(n-1, k-1)+f(n-1, k)的公式；
	 * 最后将第1位到第rowIndex+1位放入List中
	 */
	public List<Integer> getRow(int rowIndex) {
		int[] result = new int[rowIndex + 1 + 2];
		result[1] = 1;
		for (int i = 2; i <= rowIndex + 1; i++) {
			for (int j = i; j >= 1; j--) {
				result[j] = result[j - 1] + result[j];
			}
		}
		List<Integer> r = new ArrayList<>();
		for (int i = 1; i <= rowIndex + 1; i++) {
			r.add(result[i]);
		}
		return r;
	}

	/*
	 * 尝试在O(k)的时间内完成，但是在第20行的时候就超过了INTEGER.MAX_VALUE；
	 * 测试用例是[0,34]
	 */
	public List<Integer> __getRow(int rowIndex) {
		rowIndex += 1;
		List<Integer> result = new ArrayList<>();
		result.add(1);
		for (int i = 1; i < rowIndex; i++) {
			if (i <= rowIndex / 2) {
				result.add(result.get(i - 1) / i * (rowIndex - i));
			} else
				result.add(result.get(rowIndex - 1 - i));
		}
		return result;
	}
}
