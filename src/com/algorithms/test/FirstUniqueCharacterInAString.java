package com.algorithms.test;

public class FirstUniqueCharacterInAString {
	public int firstUniqChar(String s) {
		int[] count = new int[26];
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			count[chars[i] - 'a']++;
		}
		for(int i = 0 ; i < chars.length ; i++) {
			if(count[chars[i] - 'a'] == 1)
				return i;
		}
		return -1;
	}
}
