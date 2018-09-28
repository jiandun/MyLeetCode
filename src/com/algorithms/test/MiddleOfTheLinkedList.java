package com.algorithms.test;

import com.algorithms.utils.ListNode;

public class MiddleOfTheLinkedList {
	public ListNode middleNode(ListNode head) {
		ListNode stepOne = head;
		ListNode stepTwo = head;
		while (stepOne != null && stepTwo != null) {
			if (stepTwo.next != null) {
				stepTwo = stepTwo.next.next;
			} else {
				break;
			}
			stepOne = stepOne.next;
		}
		return stepOne;
	}
}