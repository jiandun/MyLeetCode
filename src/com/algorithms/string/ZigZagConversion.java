package com.algorithms.string;

public class ZigZagConversion {
	public String convert(String s, int numRows) {
		if (numRows <= 1)
			return s;
		StringBuilder[] result = new StringBuilder[numRows];
		for (int i = 0; i < numRows; i++)
			result[i] = new StringBuilder();
		int length = s.length();
		int current = 0, row = 0, direction = 1;
		while (current < length) {
			result[row].append(s.charAt(current));
			row += direction;
			if (row == numRows - 1 || row == 0)
				direction *= -1;
			current++;
		}
		StringBuilder res = new StringBuilder();
		for (StringBuilder i : result) {
			res.append(i);
		}
		return res.toString();
	}
}
