package com.algorithms.test;

public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		int[] count = new int[26];
		char[] sc = s.toCharArray();
		char[] tc = t.toCharArray();
		if (sc.length != tc.length)
			return false;
		else {
			for (int i = 0; i < sc.length; i++) {
				count[sc[i] - 'a']++;
				count[tc[i] - 'a']--;
			}
			for (int i = 0; i < count.length; i++)
				if (count[i] != 0)
					return false;
			return true;
		}
	}
}
