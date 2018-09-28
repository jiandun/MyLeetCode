package com.algorithms.test;

import com.algorithms.utils.ListNode;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode first = head;
		ListNode second = first.next;
		ListNode third = second.next;
		first.next = null;
		while (third != null) {
			second.next = first;
			first = second;
			second = third;
			third = third.next;
		}
		second.next = first;
		return second;
	}

	public ListNode _reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		else {
			ListNode second = head.next;
			head.next = null;
			return reverse(head, second);
		}
		
	}
	
	private ListNode reverse(ListNode first, ListNode second) {
		if(second == null) {
			return first;
		}else {
			ListNode third = second.next;
			second.next = first;
			return reverse(second, third);
		}
	}
}
