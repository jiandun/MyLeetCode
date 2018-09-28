package com.algorithms.string;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
	public int uniqueMorseRepresentations(String[] words) {
		String[] table = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
				".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
				"--.." };

		Set<String> result = new HashSet<String>();
		for (int i = 0; i < words.length; i++) {
			char[] chars = words[i].toCharArray();
			String t = "";
			for(int index = 0 ; index < chars.length ; index++) {
				t += table[chars[index] - 'a'];
			}
			result.add(t);
		}
		return result.size();
	}
}
