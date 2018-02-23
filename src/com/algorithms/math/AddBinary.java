package com.algorithms.math;

public class AddBinary {
	public String addBinary(String num1, String num2) {
		int last1 = num1.length() - 1;
		int last2 = num2.length() - 1;
		int plus = 0, base = 2;
		StringBuilder builder = new StringBuilder();
		while (last1 >= 0 || last2 >= 0 || plus > 0) {
			int result = plus;
			if (last1 >= 0) {
				result += num1.charAt(last1) - '0';
			}
			if (last2 >= 0) {
				result += num2.charAt(last2) - '0';
			}
			if (result >= base) {
				result -= base;
				plus = 1;
			} else {
				plus = 0;
			}
			builder.append(result);
			last1--;
			last2--;
		}
		builder.reverse();
		return builder.toString();
	}

}
