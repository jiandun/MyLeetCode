package com.algorithms.test;

import com.algorithms.utils.ListNode;

public class IntersectionOfTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA == null || headB == null)
			return null;
		ListNode a = headA, b = headB;
		int stop = 0;
		while(a != b && stop < 3) {
			a = a.next;
			b = b.next;
			if(a == null) {
				a = headB;
				stop++;
			}
			if(b == null) {
				b = headA;
				stop++;
			}
		}
		if(a == b)
			return a;
		else
			return null;
	}
}
