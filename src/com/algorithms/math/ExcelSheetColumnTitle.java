package com.algorithms.math;

public class ExcelSheetColumnTitle {
	public String convertToTitle(int n) {
		StringBuilder builder = new StringBuilder();
		while (n > 0) {
            int last = n % 26 == 0 ? 26 : n % 26;
			char bit = (char)(last - 1 +'A');
			builder.append(bit);
			n = (n-last) / 26;
		}
		builder.reverse();
		return builder.toString();
	}
}
