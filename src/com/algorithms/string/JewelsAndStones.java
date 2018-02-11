package com.algorithms.string;

import java.util.HashSet;

public class JewelsAndStones {
	public int numJewelsInStones(String J, String S) {
		HashSet<Integer> letter = new HashSet<>();
		for (char j : J.toCharArray())
			letter.add((int) j);

		int result = 0;
		for (char s : S.toCharArray()) {
			if (letter.contains((int) s)) {
				result++;
			}
		}
		return result;
	}
}
