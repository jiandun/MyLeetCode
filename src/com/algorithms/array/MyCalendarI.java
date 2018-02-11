package com.algorithms.array;

import java.util.ArrayList;

public class MyCalendarI {
	private ArrayList<Item> list;

	public MyCalendarI() {
		list = new ArrayList<>();
	}

	public boolean book(int start, int end) {
		for (Item i : list) {
			if ((i.start <= start && start < i.end) || (i.start < end && end <= i.end)
					|| (i.start <= start && end <= i.end) || (start <= i.start && i.end <= end)) {
				return false;
			}
		}
		list.add(new Item(start, end));
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
