package com.algorithms.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<>();
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			char[] chars = strs[i].toCharArray();
//			sortChars(chars, 0, chars.length - 1);
			Arrays.sort(chars);
			String sortedStr = new String(chars);
			if (map.containsKey(sortedStr)) {
				result.get(map.get(sortedStr)).add(strs[i]);
			} else {
				List<String> item = new ArrayList<>();
				item.add(strs[i]);
				result.add(item);
				map.put(sortedStr, result.size() - 1);
			}
		}
		return result;
	}

	private void sortChars(char[] chars, int left, int right) {
		if(left >= right)
			return;
		char target = chars[left];
		int l = left, r = right;
		while (l < r) {
			while (l < r && chars[r] >= target)
				r--;
			while (l < r && chars[l] <= target)
				l++;
			if (l < r) {
				char temp = chars[l];
				chars[l] = chars[r];
				chars[r] = temp;
			}
		}
		if(chars[l] < target) {
			char temp = chars[l];
			chars[l] = target;
			chars[left] = temp;
		}
		sortChars(chars, left, l - 1);
		sortChars(chars, l + 1, right);
	}

}
