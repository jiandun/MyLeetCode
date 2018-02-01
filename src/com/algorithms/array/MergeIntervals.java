package com.algorithms.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
	public List<Interval> merge(List<Interval> intervals) {
		if(intervals == null || intervals.size() <= 0)
			return intervals;
		int[] start = new int[intervals.size()];
		int[] end = new int[intervals.size()];
		for (int i = 0; i < intervals.size(); i++) {
			start[i] = intervals.get(i).start;
			end[i] = intervals.get(i).end;
		}
		Arrays.sort(start);
		Arrays.sort(end);
		List<Interval> result = new ArrayList<>();
		for (int i = 1; i < intervals.size(); i++) {
			if (start[i] <= end[i - 1]) {
				start[i] = start[i - 1];
			} else {
				result.add(new Interval(start[i - 1], end[i - 1]));
			}
		}
		result.add(new Interval(start[start.length - 1], end[end.length - 1]));
		return result;
	}

	class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}

}
