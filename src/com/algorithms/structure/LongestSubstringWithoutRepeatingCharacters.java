package com.algorithms.structure;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
		HashMap<Character, Integer> subStr = new HashMap<>();
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (!subStr.isEmpty() && subStr.containsKey(s.charAt(i))) {
				result = Math.max(result, subStr.size());
				i = subStr.get(s.charAt(i))+1;
				subStr.clear();
			}
			subStr.put(s.charAt(i), i);
		}
		return Math.max(result, subStr.size());
	}

}
