package com.algorithms.array;

import java.util.ArrayList;

public class MyCalendarII {
	private ArrayList<Item> one;
	private ArrayList<Item> two;

	public MyCalendarII() {
		one = new ArrayList<>();
		two = new ArrayList<>();
	}

	public boolean book(int start, int end) {
		end--;// 左闭右开的设定真蛋疼

		for (Item i : two) {
			if ((i.start <= start && start <= i.end) || (i.start <= end && end <= i.end)
					|| (i.start <= start && end <= i.end) || (start <= i.start && i.end <= end)) {
				return false;
			}
		}

		for (Item i : one) {
			if (i.start <= start && start <= i.end) {
				two.add(new Item(start, Math.min(end, i.end)));
			} else if (i.start <= end && end <= i.end) {
				two.add(new Item(Math.max(i.start, start), end));
			} else if (start <= i.start && i.end <= end) {
				two.add(new Item(i.start, i.end));
			}
		}
		one.add(new Item(start, end));
		return true;
	}

	class Item {
		int start;
		int end;

		public Item(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}
}
