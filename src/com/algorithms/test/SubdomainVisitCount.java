package com.algorithms.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class SubdomainVisitCount {
	public List<String> subdomainVisits(String[] cpdomains) {
		HashMap<String, Integer> result = new HashMap<String, Integer>();
		for (int i = 0; i < cpdomains.length; i++) {
			String[] split = cpdomains[i].split(" ");
			int times = Integer.parseInt(split[0]);
			String target = split[1];
			int start = 0;
			do {
				target = target.substring(start, target.length());
				if (!result.containsKey(target)) {
					result.put(target, times);
				} else {
					result.put(target, result.get(target) + times);
				}
				start = target.indexOf(".") + 1;
			} while (start > 0);
		}
		List<String> list = new ArrayList<String>();
		Iterator<String> ite = result.keySet().iterator();
		while (ite.hasNext()) {
			String key = ite.next();
			list.add(result.get(key) + " "+ key);
			System.out.println(key + "-" + result.get(key));
		}
		return list;
	}
}
