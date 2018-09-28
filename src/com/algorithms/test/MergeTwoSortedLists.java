package com.algorithms.test;

import com.algorithms.utils.ListNode;

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null || l2 == null)
			return l1 == null ? l2 : l1;
		ListNode root = new ListNode(0);
		ListNode result = root;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				result.next = l1;
				l1 = l1.next;
			} else {
				result.next = l2;
				l2 = l2.next;
			}
			result = result.next;
		}
		if (l1 != null)
			result.next = l1;
		if (l2 != null)
			result.next = l2;
		
		return root.next;
	}
}
