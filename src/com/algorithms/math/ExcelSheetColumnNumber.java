package com.algorithms.math;

public class ExcelSheetColumnNumber {
	public int titleToNumber(String s) {
		char[] title = s.toCharArray();
		int result = 0, len = title.length;
		for (int i = 0; i < len; i++) {
			int bit = len - 1 - i;
			result += (title[bit] - 'A' + 1) * Math.pow(26, i);
		}
		return result;
	}
}
