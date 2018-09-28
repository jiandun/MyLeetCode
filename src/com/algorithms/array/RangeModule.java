package com.algorithms.array;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * 
 * @author maple
 *
 */
public class RangeModule {
	TreeMap<Integer, Integer> range;

	public RangeModule() {
		range = new TreeMap<Integer, Integer>();
	}

	public void addRange(int left, int right) {
		right -= 1;
		Iterator<Map.Entry<Integer, Integer>> ite = range.entrySet().iterator();
		while (ite.hasNext() && left <= right) {
			Map.Entry<Integer, Integer> e = ite.next();
			if (left <= e.getKey()) {
				if (right < e.getKey()) {
					break;
				} else {
					right = Math.max(e.getValue(), right);
					ite.remove();
				}
			} else if (left <= e.getValue()) {
				left = e.getKey();
				if (right <= e.getValue()) {
					right = -1;
					break;
				}
			}
		}
		if (left <= right) {
			range.put(left, right);
		}
	}

	public boolean queryRange(int left, int right) {
		return false;
	}

	public void removeRange(int left, int right) {
		right -= 1;
		Iterator<Map.Entry<Integer, Integer>> ite = range.entrySet().iterator();
		while (ite.hasNext() && left <= right) {
			Map.Entry<Integer, Integer> e = ite.next();
			if (left < e.getKey()) {
				if(right < e.getKey()) {
					break;
				}else if (right <= e.getValue()) {
					ite.remove();
					if (right < e.getValue())
						range.put(right + 1, e.getValue());
					break;
				} else {
					ite.remove();
					left = e.getValue() + 1;
				}
			} else if (left <= e.getValue()) {
				if (right < e.getValue()) {
					if (left == e.getKey()) {
						ite.remove();
						range.put(right + 1, e.getValue());
					} else {
						range.put(e.getKey(), left - 1);
						range.put(right + 1, e.getValue());
					}
					break;
				} else if (right == e.getValue()) {
					if (left == e.getKey())
						ite.remove();
					else {
						left = e.getKey();
						right = left-1;
						range.put(e.getKey(), left - 1);
					}
					break;
				} else {
					range.put(e.getKey(), left - 1);
					left = e.getValue() + 1;
				}
			}
		}
	}
}

/**
 * Your RangeModule object will be instantiated and called as such: RangeModule
 * obj = new RangeModule(); obj.addRange(left,right); boolean param_2 =
 * obj.queryRange(left,right); obj.removeRange(left,right);
 */