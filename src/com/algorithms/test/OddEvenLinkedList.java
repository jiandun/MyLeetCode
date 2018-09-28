package com.algorithms.test;

import com.algorithms.utils.ListNode;

public class OddEvenLinkedList {
	public ListNode oddEvenList(ListNode head) {
		if(head != null) {
			ListNode odd = head, even = head.next, evenHead = even;
			while(even != null && even.next != null) {
				odd.next = odd.next.next;
				even.next = even.next.next;
				odd = odd.next;
				even.next = even.next;
			}
			odd.next = evenHead;
		}
		return head;
	}

}
