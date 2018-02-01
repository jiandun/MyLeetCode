package com.algorithms.structure;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode result = new ListNode(0);
		ListNode current = result;
		while (l1 != null || l2 != null) {
			current.next = new ListNode(0);
			current = current.next;
			int digits = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
			carry = 0;
			if (digits >= 10) {
				carry = digits / 10;
				digits -= 10;
			}
			if (l1 != null) {
				l1 = l1.next;
			}
			if (l2 != null) {
				l2 = l2.next;
			}
			current.val = digits;
		}
		if (carry > 0) {
			current.next = new ListNode(carry);
		}

		return result.next;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
