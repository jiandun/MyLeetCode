package com.algorithms.math;

import java.util.HashMap;

public class RomanToInteger {
	public int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int number = 0;
		char prev = '#';
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			int value = map.get(ch);
			if (value < number && ch != prev) {
				number = number - value;
			} else {
				number = number + value;
			}
			prev = ch;
		}
		return number;
	}
}
